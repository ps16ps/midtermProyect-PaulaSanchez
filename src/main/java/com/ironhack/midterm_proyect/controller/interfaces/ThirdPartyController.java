package com.ironhack.midterm_proyect.controller.interfaces;

import com.ironhack.midterm_proyect.controller.dto.ThirdPartyDTO;
import com.ironhack.midterm_proyect.model.user.ThirdParty;

public interface ThirdPartyController {
    ThirdParty createThirdParty(ThirdPartyDTO thirdPartyDTO);
}
