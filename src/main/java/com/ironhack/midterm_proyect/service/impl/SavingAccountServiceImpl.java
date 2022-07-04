package com.ironhack.midterm_proyect.service.impl;

import com.ironhack.midterm_proyect.classes.Money;
import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import com.ironhack.midterm_proyect.model.account.SavingAccount;
import com.ironhack.midterm_proyect.model.account.StudentAccount;
import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.repository.account.CheckingAccountRepository;
import com.ironhack.midterm_proyect.repository.account.SavingAccountRepository;
import com.ironhack.midterm_proyect.repository.user.AccountHolderRepository;
import com.ironhack.midterm_proyect.service.interfaces.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {
    @Autowired
    SavingAccountRepository savingAccountRepository;
    SavingAccount savingAccount;
    AccountHolderRepository accountHolderRepository;
    StudentAccount studentAccount;
    User user;



    public SavingAccount createSavingAccount(int accountNumber, BigDecimal amount, AccountHolder primaryOwner,
                                                 AccountHolder secondaryOwner, String secretKey) {

        Money balance = new Money(amount);
        Optional<AccountHolder> optionalPrimaryAccountHolder = accountHolderRepository.findById(user.getId());
        if (optionalPrimaryAccountHolder.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Primary Owner does not exist");
        } else {
            savingAccount = new SavingAccount(
                    accountNumber,
                    balance,
                    primaryOwner,
                    secondaryOwner,
                    secretKey
            );
            return savingAccountRepository.save(savingAccount);
        }
    }
}
