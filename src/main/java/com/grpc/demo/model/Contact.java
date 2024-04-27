package com.grpc.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private int id;
    private String email;
    private String mobile;
    private LocalDateTime createdAt;
}
