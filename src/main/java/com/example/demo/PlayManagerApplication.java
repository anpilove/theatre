package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class PlayManagerApplication extends SpringBootServletInitializer {
    // запуск сервера

    public static void main(String[] args) {
        SpringApplication.run(PlayManagerApplication.class, args);

    }
}
