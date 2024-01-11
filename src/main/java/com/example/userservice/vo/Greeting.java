package com.example.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {
    // application.yml 파일의 변수 값 사용
    @Value("${greeting.message}")
    private String message;
}
