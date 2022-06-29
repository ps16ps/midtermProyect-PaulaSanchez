package com.ironhack.midterm_proyect.model.account;

import com.ironhack.midterm_proyect.enums.Status;
import com.ironhack.midterm_proyect.enums.AccountType;
import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.classes.Money;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "student_checking_account")
public class StudentAccount extends Account{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "secret_key", nullable = false)
    @NotEmpty(message = "Secret Key is necessary")
    private String secretKey;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    public StudentAccount() {
    }

    public StudentAccount(String accountNumber, Money balance, User primaryOwner, User secondaryOwner,
                          AccountType accountType, String secretKey, LocalDate creationDate, Status status) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.secretKey = secretKey;
        this.creationDate = creationDate;
        this.status = status;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
