package com.grpc.demo;

import com.grpc.demo.db.StaticDatabase;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GrpcDemoApplication {
	@Autowired
	private StaticDatabase staticDatabase;

	public static void main(String[] args) {
		SpringApplication.run(GrpcDemoApplication.class, args);
	}

	@PostConstruct
	public void init(){
		staticDatabase.getAllUsers().forEach(System.out::println);
	}

}
