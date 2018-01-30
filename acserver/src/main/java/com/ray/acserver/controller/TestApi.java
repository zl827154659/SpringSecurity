package com.ray.acserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class TestApi {

    @RequestMapping("/user")
    public String testUser() {
        return "user";
    }

    @RequestMapping("/admin")
    public String testAdmin() {
        return "admin";
    }
}
