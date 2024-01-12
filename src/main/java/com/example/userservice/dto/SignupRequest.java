package com.example.userservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SignupRequest {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;
    private String encryptedPwd;
}
