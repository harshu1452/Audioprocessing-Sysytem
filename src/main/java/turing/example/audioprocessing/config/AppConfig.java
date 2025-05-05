package turing.example.audioprocessing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "turing.example.audioprocessing")
public class AppConfig {
    // No need to define beans manually if using @ComponentScan
}


