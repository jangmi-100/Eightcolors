package com.springbootfinal.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAdminDto {
    private Long userNo;          // 회원 번호
    private String id;            // 일반 아이디
    private String passwd;        // 비밀번호
    private String email;         // 이메일
    private String phone;         // 휴대폰번호
    private Integer phoneVerify;  // 전화번호 인증 여부
    private String name;          // 이름
    private String zipcode;       // 우편번호
    private String address1;      // 주소
    private String address2;      // 상세주소
    private String loginType;     // 로그인 매개체 (local, google, kakao, naver)
    private String providerId;    // 소셜 로그인 제공자 ID
    private Timestamp regDate; // 회원가입일
    private Integer point;
}
