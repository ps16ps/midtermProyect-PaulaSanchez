package com.ironhack.midterm_proyect.service.impl;

import com.ironhack.midterm_proyect.model.user.ThirdParty;
import com.ironhack.midterm_proyect.model.user.User;
import com.ironhack.midterm_proyect.repository.user.ThirdPartyRepository;
import com.ironhack.midterm_proyect.repository.user.UserRepository;
import com.ironhack.midterm_proyect.service.interfaces.ThirdpartyService;
import jdk.internal.icu.impl.Punycode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ThirdPartyServiceImpl implements ThirdpartyService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ThirdPartyRepository thirdPartyRepository;


    public ThirdParty createThirdParty(String username, String password, String name, String hashedKey) {

        UserRepository userRepository = new UserRepository;

        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "User already exist");
        } else {

            ThirdParty thirdParty = new ThirdParty(username,passwordEncoder.encode(password), LocalDate.now(),name,hashedKey);
            return thirdPartyRepository.save(thirdParty);

        }
    }

}
