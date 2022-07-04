package com.ironhack.midterm_proyect.model.account;

import com.ironhack.midterm_proyect.enums.Status;
import com.ironhack.midterm_proyect.enums.AccountType;
import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.classes.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "saving_account")
public class SavingAccount extends Account {

    @Column(name = "secret_key", nullable = false)
    private String secretKey;
    @Column(name = "minimum_balance")
    private BigDecimal minimumBalance;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @Column(name = "interest_rate")
    private double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(int accountNumber, Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner,
                         AccountType accountType, String secretKey, BigDecimal minimumBalance, LocalDate creationDate, Status status, double interestRate) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.secretKey = secretKey;
        this.minimumBalance = minimumBalance;
        this.creationDate = creationDate;
        this.status = status;
        this.interestRate = interestRate;
    }

    public SavingAccount(int accountNumber, Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner,
                         AccountType accountType, String secretKey, LocalDate creationDate, Status status) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.secretKey = secretKey;
        this.minimumBalance = new BigDecimal("1000").setScale(3, RoundingMode.HALF_EVEN);
        this.creationDate = creationDate;
        this.status = status;
        this.interestRate = 0.0025;
    }

    public SavingAccount(int accountNumber, Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, String secretKey) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, AccountType.SAVING);
        this.secretKey = secretKey;
        this.minimumBalance = new BigDecimal("1000").setScale(3, RoundingMode.HALF_EVEN);
        this.interestRate = 0.0025;
    }    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
