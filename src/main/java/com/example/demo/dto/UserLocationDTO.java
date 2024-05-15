package com.example.demo.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private Long id;
    private String email;
    private String place;
    private double longtitude;
    private double latitude;
}
