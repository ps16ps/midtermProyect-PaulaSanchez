package com.ironhack.midterm_proyect.repository.user;

import com.ironhack.midterm_proyect.model.user.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    Optional<Admin> findById(Long id);
}
