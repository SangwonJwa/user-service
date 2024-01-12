package com.example.userservice.service;

import com.example.userservice.dto.SignupRequest;

public interface UserService {
    SignupRequest createUser(SignupRequest dto);
}
