package com.example.demoblog.payloads;


import lombok.Data;

@Data
public class JwtAuthResponse {
    private  String token;
    private String username;
}
