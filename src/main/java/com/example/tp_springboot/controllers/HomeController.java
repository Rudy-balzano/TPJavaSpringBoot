package com.example.tp_springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    public HomeController() {
    }

    @GetMapping
    public String home() {
        return this.getAppVersion();
    }


    public String getAppVersion() {
        return appVersion;
    }
}
