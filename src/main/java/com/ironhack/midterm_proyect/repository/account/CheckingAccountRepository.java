package com.ironhack.midterm_proyect.repository.account;

import com.ironhack.midterm_proyect.model.account.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount,Long> {
    Optional<CheckingAccount> findById(Long id);
}
