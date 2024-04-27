package com.grpc.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class UserResponseDTO {
    private String name;
    private DetailResponseDTO detail;
    private List<ContactResponseDTO> contacts;
    private LocalDateTime createdAt;
}
