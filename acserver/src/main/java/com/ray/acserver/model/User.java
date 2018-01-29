package com.ray.acserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        Authority authority = new Authority();
        authority.setAuthority("ADMIN");
        this.authorities = authorityList;
    }

    public User() {
    }

    public User(String username, String password, Collection<GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
