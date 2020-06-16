package com.example.consumer1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/echo/{name}")
    public String echoAppName(@PathVariable String name) {
        String path = String.format("%s/echo/%s", serverURL, name);
        System.out.println("request path:" + path);
        return restTemplate.getForObject(path, String.class);
    }

}
