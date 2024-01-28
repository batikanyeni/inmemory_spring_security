package com.batikan.security.inmemory.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {
    @GetMapping
    public String privateHelloWord(){
        return "Hello world! from private endpoint";
    }
    @GetMapping("/user")
    public String helloWorldUser(){
        return "hello from the private user endpoint";
    }


    @GetMapping("/admin")
    public String helloWorldAdmin(){
        return "hello from the private admin endpoint";
    }
}
