package com.ironhack.midterm_proyect.model.account;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ironhack.midterm_proyect.enums.AccountType;
import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.classes.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "balance")),
            @AttributeOverride(name = "currency", column = @Column(name = "currency")),
    })
    private Money balance;

    @Column(name = "penalty_fee")
    private final BigDecimal PENALTYFEE = new BigDecimal("40").setScale(2, RoundingMode.HALF_EVEN);

    @ManyToOne
    @JoinColumn(name = "primary_owner_id")
    @JsonBackReference
    private User primaryOwner;
    @ManyToOne
    @JoinColumn(name = "secondary_owner_id")
    @JsonBackReference
    private User secondaryOwner;
    @Column(name = "account_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    public Account() {
    }

    public Account(String accountNumber, Money balance, User primaryOwner, User secondaryOwner, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.accountType = accountType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public BigDecimal getPENALTYFEE() {
        return PENALTYFEE;
    }

    public User getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(User primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public User getSecondaryOwner() {
        return secondaryOwner;
    }

    public void setSecondaryOwner(User secondaryOwner) {
        this.secondaryOwner = secondaryOwner;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}

