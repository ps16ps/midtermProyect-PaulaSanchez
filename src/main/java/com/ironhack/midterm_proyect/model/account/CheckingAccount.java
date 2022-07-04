package com.ironhack.midterm_proyect.model.account;

import com.ironhack.midterm_proyect.enums.AccountType;
import com.ironhack.midterm_proyect.enums.Status;
import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.classes.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "checking_account")
public class CheckingAccount extends Account{
    @Column(name = "secret_key", nullable = false)
    private String secretKey;
    @Column(name = "minimum_balance")
    private final BigDecimal MINIMUMBALANCE = new BigDecimal("250").setScale(3, RoundingMode.HALF_EVEN);
    @Column(name = "monthly_maintenance_fee")
    private final BigDecimal MONTHLYMAINTENANCEFEE = new BigDecimal("12").setScale(3, RoundingMode.HALF_EVEN);
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    public CheckingAccount() {
    }

    public CheckingAccount(int accountNumber, Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner,
                           String secretKey) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, AccountType.CHECKING);
        this.secretKey = secretKey;
        this.creationDate = creationDate;
        this.status = status;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public BigDecimal getMINIMUMBALANCE() {
        return MINIMUMBALANCE;
    }

    public BigDecimal getMONTHLYMAINTENANCEFEE() {
        return MONTHLYMAINTENANCEFEE;
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
