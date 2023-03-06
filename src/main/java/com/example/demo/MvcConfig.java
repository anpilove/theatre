package com.example.demo;
// класс для обединения всех методов


import org.springframework.context.annotation.Configuration; // обединение методов в одно приложение
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){

    }
}
