package com.ray.acserver.security;

import com.ray.acserver.dao.UserDao;
import com.ray.acserver.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    @Resource
    private UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUserName(username);
        SecurityUserDetails securityUserDetails = new SecurityUserDetails(user);
        return securityUserDetails;
    }
}
