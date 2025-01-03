package com.springbootfinal.app.controller;


import com.springbootfinal.app.domain.ResidenceDto;
import com.springbootfinal.app.service.ResidenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ResidenceController {

    @Autowired
    private ResidenceService residenceService;

    @GetMapping("residence")
    public String residence(Model model){

        model.addAttribute("RList",residenceService.residenceList());
        return "residence/residenceList2";
    }

}
