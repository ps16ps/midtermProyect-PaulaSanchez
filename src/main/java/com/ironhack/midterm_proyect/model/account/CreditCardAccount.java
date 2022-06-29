package com.ironhack.midterm_proyect.model.account;

import com.ironhack.midterm_proyect.enums.AccountType;
import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.classes.Money;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "credit_card_account")
public class CreditCardAccount extends Account{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "credit_limit")
    private BigDecimal creditLimit;
    @Column(name = "interest_rate")
    private Float interestRate;

    public CreditCardAccount() {
    }

    public CreditCardAccount(String accountNumber, Money balance, User primaryOwner, User secondaryOwner,
                             AccountType accountType, Long id, BigDecimal creditLimit, Float interestRate) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.id = id;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }
}
