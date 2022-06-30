package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DemoApplication {
	static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/restapi_example";
	static final String USER = "admin";
	static final String PASS = "123456";

	public static void main(String[] args) throws SQLException {

		SpringApplication.run(DemoApplication.class, args);
	}

}
