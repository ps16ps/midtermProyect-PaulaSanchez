package com.ironhack.midterm_proyect.service.interfaces;

import com.ironhack.midterm_proyect.model.user.ThirdParty;

public interface ThirdPartyService {

    ThirdParty createThirdParty(String username, String password, String name, String hashedKey);
}
