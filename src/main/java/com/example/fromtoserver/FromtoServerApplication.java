package com.example.fromtoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FromtoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FromtoServerApplication.class, args);
    }

}
