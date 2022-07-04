package com.ironhack.midterm_proyect.controller.interfaces;

import com.ironhack.midterm_proyect.model.user.AccountHolder;

import java.util.List;
import java.util.Optional;

public interface AccountHolderController {
    List<AccountHolder> findAll();
    Optional<AccountHolder> findById(Long id);
}
