package com.example.SpringKeyCloakApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/")
    public String index() {
        return "This is freely accessible page";
    }

    @GetMapping(value = "/user")
    public String user() {
        return "This page is for users only";
    }
}
