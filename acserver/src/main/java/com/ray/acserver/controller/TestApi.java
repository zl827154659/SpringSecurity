package com.ray.acserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class TestApi {

    @ResponseBody
    @PreAuthorize("hasAuthority('ORDINARY')")
    @RequestMapping("/user")
    public String testUser() {
        return "userinfo";
    }

    @ResponseBody
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping("/admin")
    public String testAdmin() {
        return "admininfo";
    }
}
