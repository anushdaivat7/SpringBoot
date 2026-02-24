package com.example.BACKEND_E_C;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class BackendECApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendECApplication.class, args);
        System.out.println("Application Started Successfully!....");
	}

}
