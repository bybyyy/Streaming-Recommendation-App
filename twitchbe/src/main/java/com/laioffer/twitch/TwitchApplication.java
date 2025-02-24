package com.laioffer.twitch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

//This is the start of the application
@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class TwitchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwitchApplication.class, args);
    }
}
