package com.ironhack.midterm_proyect.controller.impl;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.midterm_proyect.classes.Adress;
import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.repository.user.AccountHolderRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class AccountHolderControllerImplTest {

    @Autowired
    AccountHolderRepository accountHolderRepository;

    @Autowired
    private WebApplicationContext webApplicationContext; // Nos va a permitir trabajar con los controllers
    private MockMvc mockMvc; // Simular peticiones HTTP
    private final ObjectMapper objectMapper = new ObjectMapper(); // Contruir Objetos JSON a partir de clase de JAVA

    private AccountHolder ah1, ah2;
    @BeforeEach
    void setUp() {
        // Initiacializar el MockMvc
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        Adress addres1 = new Adress("madrid", "españa","hdydyd", 56565);
        LocalDate localDate1 = LocalDate.now();
        ah1 = new AccountHolder("juanu", "abc123",localDate1 ,addres1,"juani@gmail.com" );
        ah2 = new AccountHolder("marta", "abc023",localDate1 ,addres1,"marta@gmail.com" );
        accountHolderRepository.saveAll(List.of(ah1, ah2));
    }
    @AfterEach
    void tearDown() {
       accountHolderRepository.deleteAll();
    }
    @Test
    void findAll_NoParams_AllAccountHolders() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/account-holders"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentType(MediaType .APPLICATION_JSON))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("juanu"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("marta"));
    }

//    @Test
//    void findById() {
//    }
}