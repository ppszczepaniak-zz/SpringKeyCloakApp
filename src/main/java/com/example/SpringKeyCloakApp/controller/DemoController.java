package com.example.SpringKeyCloakApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/")
    public String index() {
        return "<center>" +
                "<font size=\"5\">" +
                "<p>Hello stranger, this is a freely accessible page.</p>\n" +
                "<p>In order to visit page for registered users, please click " +
                "<a href=\"http://127.0.0.1:8081/user\">here</a>.</p>" +
                "</font>" +
                "</center>";

    }

    //TODO consider https here

    @GetMapping(value = "/user")
    public String user() {
        return "<center>" +
                "<font size=\"5\">" +
                "<p>Welcome user.</p>\n" +
                "<p>This page is for registered users only!</p>" +
                "</font>" +
                "</center>";
    }
}
