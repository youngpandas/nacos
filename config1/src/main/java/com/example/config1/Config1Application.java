package com.example.config1;

import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Config1Application {

    public static void main(String[] args) {
        SpringApplication.run(Config1Application.class, args);
    }

}
