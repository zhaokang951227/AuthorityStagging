package com.kangge.authenticate.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kangge.authenticate"})
public class AuthenticateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticateApplication.class, args);
    }

}
