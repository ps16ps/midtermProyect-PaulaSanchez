package com.ironhack.midterm_proyect.model.user;
import com.ironhack.midterm_proyect.enums.Role;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "admin")
public class Admin extends User{

    public Admin(){
    }
    @Column(name = "admin_name")
    private String name;

    public Admin(String username, String password, Role role, String name) {
        super(username, password, role);
        this.name = name;
    }
}
