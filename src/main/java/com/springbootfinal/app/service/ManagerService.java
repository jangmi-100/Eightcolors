package com.springbootfinal.app.service;

import com.springbootfinal.app.domain.ReservationDto;
import com.springbootfinal.app.domain.ResidenceDto;
import com.springbootfinal.app.domain.UserAdminDto;
import com.springbootfinal.app.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    public List<ResidenceDto> residenceList(){
        return managerMapper.residenceList();
    };

    public Map<String, Object> userList(String search){

        boolean searchOption = search.equals("null") ?false:true;
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<UserAdminDto> uList=managerMapper.userList(search);

        if(searchOption){
            modelMap.put("search",search);
        }
        modelMap.put("uList", uList);
        modelMap.put("searchOption", searchOption);
        return modelMap;
    }
    
    public List<ReservationDto> reservationList(){
    	return managerMapper.reservationList();
    }
}
