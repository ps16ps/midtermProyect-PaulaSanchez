package com.ironhack.midterm_proyect.classes;

import com.ironhack.midterm_proyect.model.user.AccountHolder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataValidation {
    public static boolean validateAgeOfPrimaryOwner(AccountHolder accountHolder) {
        LocalDate dateForStudentAccount = LocalDate.now().minusYears(24L);
        return accountHolder.getDateOfBirth().compareTo(dateForStudentAccount) >= 0;
    }
}