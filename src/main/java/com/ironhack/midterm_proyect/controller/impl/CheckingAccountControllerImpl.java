package com.ironhack.midterm_proyect.controller.impl;
import com.ironhack.midterm_proyect.controller.dto.CheckingAccountDTO;
import com.ironhack.midterm_proyect.controller.interfaces.CheckingAccountController;
import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import com.ironhack.midterm_proyect.service.interfaces.CheckingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController

public class CheckingAccountControllerImpl implements CheckingAccountController {
    @Autowired
    CheckingAccountService checkingAccountService;


    @PostMapping("/checkingaccounts")
    @ResponseStatus(HttpStatus.CREATED)
    public CheckingAccount createCheckingAccount(@RequestBody @Valid CheckingAccountDTO checkingAccountDTO) {
        return  checkingAccountService.createCheckingAccount(
                checkingAccountDTO.getAccountNumber(),
                checkingAccountDTO.getAmount(),
                checkingAccountDTO.getPrimaryOwnerId(),
                checkingAccountDTO.getSecondaryOwnerId(),
                checkingAccountDTO.getSecretKey());
    }
}
