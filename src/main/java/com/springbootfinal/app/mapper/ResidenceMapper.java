package com.springbootfinal.app.mapper;

import com.springbootfinal.app.domain.ResidenceDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResidenceMapper {

    public List<ResidenceDto> residenceList();
}
