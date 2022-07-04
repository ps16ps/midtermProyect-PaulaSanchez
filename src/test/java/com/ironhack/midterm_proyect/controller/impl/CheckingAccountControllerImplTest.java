package com.ironhack.midterm_proyect.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.midterm_proyect.classes.Adress;
import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.repository.account.CheckingAccountRepository;
import com.ironhack.midterm_proyect.repository.user.AccountHolderRepository;
import com.ironhack.midterm_proyect.service.interfaces.CheckingAccountService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class CheckingAccountControllerImplTest {

    @Autowired
    CheckingAccountRepository checkingAccountRepository;
    CheckingAccountService checkingAccountService;
    AccountHolderRepository accountHolderRepository;
    @Autowired
    private WebApplicationContext webApplicationContext; //
    private MockMvc mockMvc; //
    private final ObjectMapper objectMapper = new ObjectMapper();
    private AccountHolder ah1, ah2;
    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        Adress addres1 = new Adress("madrid", "españa", "hdydyd", 56565);
        LocalDate localDate1 = LocalDate.now();
        ah1 = new AccountHolder("juanu", "abc123", localDate1, addres1, "juani@gmail.com");
        ah2 = new AccountHolder("marta", "abc023", localDate1, addres1, "marta@gmail.com");
        accountHolderRepository.saveAll(List.of(ah1, ah2));
    }

    @AfterEach
    void tearDown() {
        checkingAccountRepository.deleteAll();
    }

    @Test
    void createCheckingAccount_test() {
        CheckingAccount ca1 = checkingAccountService.createCheckingAccount(675, BigDecimal.valueOf(876098), ah1,ah2, "ads45" );
        Optional<CheckingAccount> optionalCheckingAccount = checkingAccountRepository.findById(ca1.getId());
        assertTrue(optionalCheckingAccount.isPresent());
    }
}