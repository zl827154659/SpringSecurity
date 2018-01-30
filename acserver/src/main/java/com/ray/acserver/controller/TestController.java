package com.ray.acserver.controller;

import com.ray.acserver.dao.UserDao;
import com.ray.acserver.model.Authority;
import com.ray.acserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/add")
public class TestController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/Ordinary")
    public String addUser() {
        User user = new User("USER2","123456");
        userDao.addOne(user);
        return "success";
    }

    @RequestMapping("/Admin")
    public String addAdmin() {
        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        Authority authority = new Authority();
        authority.setAuthority("ADMIN");
        User user = new User("ADMIN1", "123456", authorityList);
        return "success";
    }
}
