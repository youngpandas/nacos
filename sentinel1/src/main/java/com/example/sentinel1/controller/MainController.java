package com.example.sentinel1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/testA")
    public String testA() {
        return "testA";
    }


    @GetMapping("/testB")
    public String testB() {
        return "testB";
    }

}
