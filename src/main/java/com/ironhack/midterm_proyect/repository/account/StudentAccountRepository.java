package com.ironhack.midterm_proyect.repository.account;

import com.ironhack.midterm_proyect.model.account.StudentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAccountRepository extends JpaRepository<StudentAccount,Long> {
}
