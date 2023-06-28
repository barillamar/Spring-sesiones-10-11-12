package com.example.securityoldversion3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class SecurityOldVersion3Application {

	public static void main(String[] args) {

		SpringApplication.run(SecurityOldVersion3Application.class, args);
/*
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/spring_test", "prueba", "Prueba2022");

		Statement statement = connection.createStatement();

		String createTableQuery = "CREATE TABLE laptops (id SERIAL PRIMARY KEY)";
		statement.executeUpdate(createTableQuery);

		statement.close();
		connection.close();

		 */

	}

}
