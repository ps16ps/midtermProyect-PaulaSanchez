package com.ironhack.midterm_proyect.service.interfaces;

import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import com.ironhack.midterm_proyect.model.account.SavingAccount;
import com.ironhack.midterm_proyect.model.user.AccountHolder;

import java.math.BigDecimal;

public interface SavingAccountService {
    SavingAccount createSavingAccount(int accountNumber, BigDecimal amount, AccountHolder primaryOwner,
                                      AccountHolder secondaryOwner, String secretKey);
}
