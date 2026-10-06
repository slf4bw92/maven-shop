package com.example.mavenshop.domain;

import lombok.Data;

@Data
public class Member {

    private Long mbrNo;
    private String mbrId;
    private String mbrEnpswd;
    private String mbrNm;
    private int mbrAge;
}
