package com.example.URLHitCounter.config;

import com.example.URLHitCounter.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class DataSource {
    @Bean
    public HashMap<String, User> createDB(){
        return new HashMap<String,User>();
    }
}
