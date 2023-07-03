package com.exemple.springbootuploadfiles.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.exemple.springbootuploadfiles")
public class AppConfig {
    @Bean
    public FilesStorageService filesStorageService() {
        return new FilesStorageServiceImpl();
    }
}