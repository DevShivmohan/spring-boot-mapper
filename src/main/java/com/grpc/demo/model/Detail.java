package com.grpc.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
    private int id;
    private String village;
    private LocalDateTime createdAt;
}
