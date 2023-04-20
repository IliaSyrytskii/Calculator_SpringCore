package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "org.example")
public class CoreConfiguration {
    @Bean
    public Scanner sc() {
        return new Scanner(System.in);
    }
}
