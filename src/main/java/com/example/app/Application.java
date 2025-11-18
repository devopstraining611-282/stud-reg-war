package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
// EXTENSION: Must extend SpringBootServletInitializer for external deployment
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //  Configures the application when deployed in a servlet container
    @Override
    protected org.springframework.boot.builder.SpringApplicationBuilder configure(
            org.springframework.boot.builder.SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
