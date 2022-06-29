package com.ironhack.midterm_proyect.repository.user;

import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
