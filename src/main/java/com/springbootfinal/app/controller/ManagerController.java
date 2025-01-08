package com.springbootfinal.app.controller;


import com.springbootfinal.app.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

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
    public String userList(Model model,@RequestParam(value="search", required=false,
            defaultValue="null") String search){
        Map<String, Object> modelMap = managerService.userList(search);
        model.addAllAttributes(modelMap);
        return "manager/useradmin";
    }
    
    @GetMapping("/ordermgmt")
    public String reservationList(Model model){
        model.addAttribute("reList",managerService.reservationList());
        return "manager/ordermgmt";
    }

}
