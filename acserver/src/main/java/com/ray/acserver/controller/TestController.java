package com.ray.acserver.controller;

import com.ray.acserver.dao.UserDao;
import com.ray.acserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/add")
    public String addUser() {
        User user = new User("USER2","123456");
        userDao.addOne(user);
        return "success";
    }
}
