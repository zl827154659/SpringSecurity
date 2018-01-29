package com.ray.acserver.model;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {
    String role;

    @Override
    public String getAuthority() {
        return this.role;
    }

    public void setAuthority(String role){
        this.role = role;
    }
}
