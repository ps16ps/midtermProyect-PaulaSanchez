package com.ironhack.midterm_proyect.repository.account;

import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount,Long> {
}
