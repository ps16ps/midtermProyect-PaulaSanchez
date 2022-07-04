package com.ironhack.midterm_proyect.model.user;

import com.ironhack.midterm_proyect.enums.Role;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "third_party")
public class ThirdParty extends User{
    @Column(name = "name", nullable = false)
    private String name;
    @NotEmpty
    @Column(name = "hashed_key", nullable = false)
    private String hashedKey;

    public ThirdParty() {
    }

    public ThirdParty(String username, String password, Role role, String name, String hashedKey) {
        super(username, password, role);
        this.name = name;
        this.hashedKey = hashedKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashedKey() {
        return hashedKey;
    }

    public void setHashedKey(String hashedKey) {
        this.hashedKey = hashedKey;
    }
}
