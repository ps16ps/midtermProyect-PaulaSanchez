package com.ironhack.midterm_proyect.controller.impl;

import com.ironhack.midterm_proyect.controller.interfaces.AccountHolderController;
import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.repository.user.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountHolderControllerImpl implements AccountHolderController {
    @Autowired
    AccountHolderRepository accountHolderRepository;

    @GetMapping("/account-holders")
    @ResponseStatus(HttpStatus.OK)
    public List<AccountHolder> findAll() {
        return accountHolderRepository.findAll();
    }

    @GetMapping("/accounts-holders/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<AccountHolder> findById(@PathVariable(name = "id") Long id) {
        Optional<AccountHolder> optionalAccountHolder = accountHolderRepository.findById(id);
        return Optional.of(optionalAccountHolder.get());
    }
}
