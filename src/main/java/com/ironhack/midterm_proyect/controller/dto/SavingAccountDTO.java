package com.ironhack.midterm_proyect.controller.dto;

import com.ironhack.midterm_proyect.model.user.AccountHolder;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class SavingAccountDTO {

    @NotEmpty(message = "Entity must be provided")
    private int accountNumber;
    @NotNull(message = "Amount must be provided")
    @DecimalMin(value = "0.0", message = "Amount cannot be negative")
    private BigDecimal amount;
    private String currency;
    @NotNull(message = "Primary Owner must be provided")
    private AccountHolder primaryOwnerId;
    private AccountHolder secondaryOwnerId;
    @NotEmpty(message = "Secret Key must be provided")
    private String secretKey;
    @DecimalMin(value = "1000", message = "The minimum balance of a savings account cannot be less than 100")
    private BigDecimal minimumBalance;
    @DecimalMax(value = "0.5")
    private Float interestRate;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountHolder getPrimaryOwnerId() {
        return primaryOwnerId;
    }

    public void setPrimaryOwnerId(AccountHolder primaryOwnerId) {
        this.primaryOwnerId = primaryOwnerId;
    }

    public AccountHolder getSecondaryOwnerId() {
        return secondaryOwnerId;
    }

    public void setSecondaryOwnerId(AccountHolder secondaryOwnerId) {
        this.secondaryOwnerId = secondaryOwnerId;
    }

    public String getSecretKey() {
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

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }
}
