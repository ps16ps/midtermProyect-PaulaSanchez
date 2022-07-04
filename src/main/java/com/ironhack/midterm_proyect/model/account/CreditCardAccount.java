package com.ironhack.midterm_proyect.model.account;

import com.ironhack.midterm_proyect.enums.AccountType;
import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.classes.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "credit_card_account")
public class CreditCardAccount extends Account{
    @Column(name = "credit_limit")
    private BigDecimal creditLimit;
    @Column(name = "interest_rate")
    private double interestRate;

    public CreditCardAccount() {
    }

    public CreditCardAccount(int accountNumber, Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner,
                             AccountType accountType, BigDecimal creditLimit, double interestRate) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }
    public CreditCardAccount(int accountNumber, Money balance, AccountHolder primaryOwner, AccountHolder secondaryOwner,
                             AccountType accountType) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.creditLimit = new BigDecimal("100").setScale(3, RoundingMode.HALF_EVEN);
        this.interestRate = 0.2;
    }




    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
