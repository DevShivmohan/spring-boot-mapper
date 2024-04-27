package com.grpc.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponseDTO {
    private String name;
    private DetailResponseDTO detail;
    private LocalDateTime createdAt;
}
