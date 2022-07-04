package com.ironhack.midterm_proyect.service.interfaces;

import com.ironhack.midterm_proyect.classes.Money;
import com.ironhack.midterm_proyect.enums.AccountType;
import com.ironhack.midterm_proyect.enums.Status;
import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import com.ironhack.midterm_proyect.model.user.AccountHolder;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface CheckingAccountService {

    CheckingAccount createCheckingAccount(int accountNumber, BigDecimal amount, AccountHolder primaryOwner,
                                          AccountHolder secondaryOwner, String secretKey);
}


