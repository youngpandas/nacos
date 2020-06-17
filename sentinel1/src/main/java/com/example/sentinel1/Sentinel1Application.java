package com.example.sentinel1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sentinel1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sentinel1Application.class, args);
    }

}
