package com.springbootfinal.app.controller;


import com.springbootfinal.app.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping({"/manager","/productMgmt"})
    public String residence(Model model){
        List rList = managerService.residenceList();
        model.addAttribute("rList",rList);

        return "manager/productmgmt";
    }

    @GetMapping("/useradmin")
    public String userList(Model model){
        model.addAttribute("uList",managerService.userList());
        return "manager/useradmin";
    }

}
