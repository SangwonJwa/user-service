package com.example.userservice.service;

import com.example.userservice.domain.User;
import com.example.userservice.dto.SignupRequest;
import com.example.userservice.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public SignupRequest createUser(SignupRequest dto) {
        dto.setUserId(UUID.randomUUID().toString());

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        User user = mapper.map(dto,User.class);
        user.setEncryptedPwd("encrypted_password");

        userRepository.save(user);

        return null;
    }
}
