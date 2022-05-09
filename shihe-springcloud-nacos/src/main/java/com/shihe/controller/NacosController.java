package com.shihe.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {

    @GetMapping("/nacos")
    public String nacos(){
        return "hello Nacos";
    }
}
