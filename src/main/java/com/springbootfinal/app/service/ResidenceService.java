package com.springbootfinal.app.service;

import com.springbootfinal.app.domain.ResidenceDto;
import com.springbootfinal.app.mapper.ResidenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidenceService {

    @Autowired
    private ResidenceMapper residenceMapper;

    public List<ResidenceDto> residenceList(){
        return residenceMapper.residenceList();
    };
}
