package com.example.userservice.vo;


import jakarta.persistence.*;

@Entity
@Table(name = "dummies")
public class DummyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
