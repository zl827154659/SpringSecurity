package com.ray.acserver.security;

import com.ray.acserver.dao.UserDao;
import com.ray.acserver.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

public class CustomUserDetailsService implements UserDetailsService {
    @Resource
    private UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUserName(username);
        return user;
    }
}
