package com.springbootfinal.app.service;

import com.springbootfinal.app.domain.ReservationDto;
import com.springbootfinal.app.domain.ResidenceDto;
import com.springbootfinal.app.domain.UserAdminDto;
import com.springbootfinal.app.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    public List<ResidenceDto> residenceList(){
        return managerMapper.residenceList();
    };

    public List<UserAdminDto> userList(){
        return managerMapper.userList();
    }
    
    public List<ReservationDto> reservationList(){
    	return managerMapper.reservationList();
    }
}
