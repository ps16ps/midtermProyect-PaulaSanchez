package com.ironhack.midterm_proyect.model.user;
import com.ironhack.midterm_proyect.enums.Role;
import com.ironhack.midterm_proyect.classes.Adress;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "account_holder")
public class AccountHolder extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "street")),
            @AttributeOverride(name = "city", column = @Column(name = "city")),
            @AttributeOverride(name = "country", column = @Column(name = "country")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "postal_code"))
    })
    private Adress address;

    @Column(name = "mailing_address")
    private String mailingAddress;

    public AccountHolder() {
    }

    public AccountHolder(String username, String password, Role role, Long id, LocalDate dateOfBirth, Adress address,
                         String mailingAddress) {
        super(username, password, role);
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.mailingAddress = mailingAddress;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}
