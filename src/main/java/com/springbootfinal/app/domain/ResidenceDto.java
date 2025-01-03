package com.springbootfinal.app.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
public class ResidenceDto {
    private Long residNo;
    private String residName;
    private String residDescription;
    private String residAddress;
    private String residType;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private BigDecimal totalPrice;
    private Integer discountRate;
    private BigDecimal discountedPrice;
    private BigDecimal rating;
    private Timestamp residDate;
}
