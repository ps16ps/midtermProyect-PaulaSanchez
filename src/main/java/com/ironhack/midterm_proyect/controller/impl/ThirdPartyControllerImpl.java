package com.ironhack.midterm_proyect.controller.impl;

import com.ironhack.midterm_proyect.controller.dto.ThirdPartyDTO;
import com.ironhack.midterm_proyect.controller.interfaces.ThirdPartyController;
import com.ironhack.midterm_proyect.model.user.ThirdParty;
import com.ironhack.midterm_proyect.service.interfaces.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ThirdPartyControllerImpl implements ThirdPartyController {
    @Autowired
    ThirdPartyService thirdPartyService;
    @PostMapping("/thirdparties")
    @ResponseStatus(HttpStatus.CREATED)
    public ThirdParty createThirdParty(@RequestBody @Valid ThirdPartyDTO thirdPartyDTO) {
        return thirdPartyService.createThirdParty(thirdPartyDTO.getUsername(), thirdPartyDTO.getPassword(), thirdPartyDTO.getName(), thirdPartyDTO.getHashedKey());
    }
}
