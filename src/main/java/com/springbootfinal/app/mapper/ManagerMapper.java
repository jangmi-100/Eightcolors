package com.springbootfinal.app.mapper;

import com.springbootfinal.app.domain.ReservationDto;
import com.springbootfinal.app.domain.ResidenceDto;
import com.springbootfinal.app.domain.UserAdminDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManagerMapper {

    public List<ResidenceDto> residenceList();

    public List<UserAdminDto> userList(@Param("search") String search);
    
    public List<ReservationDto>reservationList();
}
