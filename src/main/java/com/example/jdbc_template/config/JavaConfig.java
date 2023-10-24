package com.example.jdbc_template.config;

import com.example.jdbc_template.controller.Controller;
import com.example.jdbc_template.repository.DataRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Controller controller(DataRepository dataRepository) {
        return new Controller(dataRepository);
    }
    @Bean
    public DataRepository dataRepository() {
        return new DataRepository();
    }
}
