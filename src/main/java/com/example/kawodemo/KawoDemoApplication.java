package com.example.kawodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KawoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KawoDemoApplication.class, args);
    }

    //TODO user auth
    //TODO finalize account model, post+stats model

}
