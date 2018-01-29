package com.ray.acserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User implements UserDetails {
    @Id
    private Long id;

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

    public Long getID() {
        return id;
    }

    public void setID(Long ID) {
        this.id = ID;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
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
