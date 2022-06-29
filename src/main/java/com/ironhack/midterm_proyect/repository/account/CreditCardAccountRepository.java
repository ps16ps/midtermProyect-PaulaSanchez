package com.ironhack.midterm_proyect.repository.account;

import com.ironhack.midterm_proyect.model.account.CreditCardAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardAccountRepository extends JpaRepository<CreditCardAccount,Long> {
}
