package com.example.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/secret")
    public String secret() {
        return "secret";
    }

    @GetMapping("/secret-admin-page")
    public String secretAdminPage() {
        return "secret-admin-page";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

}
