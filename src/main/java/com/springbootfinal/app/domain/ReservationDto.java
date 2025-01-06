package com.springbootfinal.app.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDto {
	
	private Long payNo; // 결제 번호 (PK)
    private Long userNo; // 회원 번호 (FK)
    private Long residNo; // 숙소 번호 (FK)
    private BigDecimal totalPrice; // 총 가격
    private int usePoint; // 사용된 포인트
    private Timestamp payDate; // 결제일자

}
