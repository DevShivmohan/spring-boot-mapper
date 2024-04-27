package com.grpc.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContactResponseDTO {
    private String email;
    private String mobile;
    private LocalDateTime createdAt;
}
