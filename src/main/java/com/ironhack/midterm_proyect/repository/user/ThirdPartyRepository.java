package com.ironhack.midterm_proyect.repository.user;

import com.ironhack.midterm_proyect.model.user.AccountHolder;
import com.ironhack.midterm_proyect.model.user.ThirdParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThirdPartyRepository extends JpaRepository<ThirdParty,Long> {
}
