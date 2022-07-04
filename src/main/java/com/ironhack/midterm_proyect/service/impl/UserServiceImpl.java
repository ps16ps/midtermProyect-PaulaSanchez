package com.ironhack.midterm_proyect.service.impl;

import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.repository.user.UserRepository;
import com.ironhack.midterm_proyect.security.CustomerUserDetails;
import com.ironhack.midterm_proyect.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

}
