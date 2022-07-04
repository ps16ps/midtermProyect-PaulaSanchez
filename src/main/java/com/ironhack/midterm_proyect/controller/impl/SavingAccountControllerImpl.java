package com.ironhack.midterm_proyect.controller.impl;

import com.ironhack.midterm_proyect.controller.dto.CheckingAccountDTO;
import com.ironhack.midterm_proyect.controller.dto.SavingAccountDTO;
import com.ironhack.midterm_proyect.controller.interfaces.CheckingAccountController;
import com.ironhack.midterm_proyect.controller.interfaces.SavingAccountController;
import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import com.ironhack.midterm_proyect.model.account.SavingAccount;
import com.ironhack.midterm_proyect.service.interfaces.CheckingAccountService;
import com.ironhack.midterm_proyect.service.interfaces.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SavingAccountControllerImpl implements SavingAccountController {
    @Autowired
    SavingAccountService savingAccountService;


    @PostMapping("/checkingaccounts")
    @ResponseStatus(HttpStatus.CREATED)
    public SavingAccount createSavingAccount(@RequestBody @Valid SavingAccountDTO savingAccountDTO) {
        return  savingAccountService.createSavingAccount(
                savingAccountDTO.getAccountNumber(),
                savingAccountDTO.getAmount(),
                savingAccountDTO.getPrimaryOwnerId(),
                savingAccountDTO.getSecondaryOwnerId(),
                savingAccountDTO.getSecretKey());
    }
}
