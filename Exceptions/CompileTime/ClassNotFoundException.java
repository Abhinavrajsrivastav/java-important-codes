package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassNotFoundException implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClassNotFoundException.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException in Spring Boot!");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
