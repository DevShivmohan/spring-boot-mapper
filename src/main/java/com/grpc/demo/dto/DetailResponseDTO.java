package com.grpc.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DetailResponseDTO {
    private String village;
    private LocalDateTime createdAt;
}
