package com.api_java.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller  {


    @GetMapping("/hello")
    public String hola(){
        return "hola soy Ivan";
    }
    @PostMapping("/goodbye")
    public String chau(){
        return "Hasta Luego!";
    }


}
