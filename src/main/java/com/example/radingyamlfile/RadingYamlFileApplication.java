package com.example.radingyamlfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RadingYamlFileApplication implements CommandLineRunner {
    @Autowired
    private Config config;

    @Value("${demo.environment}")
    public String test;

    @Value("${test}")
    public String test1;

    public static void main(String[] args) {
        SpringApplication.run(RadingYamlFileApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(config);
    }
}
