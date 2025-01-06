package com.springbootfinal.app.service;

import com.springbootfinal.app.domain.ResidenceDto;
import com.springbootfinal.app.domain.UserAdminDto;
import com.springbootfinal.app.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerMapper managerMapperMapper;

    public List<ResidenceDto> residenceList(){
        return managerMapperMapper.residenceList();
    };

    public List<UserAdminDto> userList(){
        return managerMapperMapper.userList();
    }
}
