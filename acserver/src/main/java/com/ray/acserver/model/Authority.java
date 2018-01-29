package com.ray.acserver.model;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {
    private String role;

    @Override
    public String getAuthority() {
        /*
        role:
        "ADMIN"-管理员,
        "GUEST"-游客用户,
        "ORDINARY"-普通用户,
        "SUPER_USER"-超级用户
        */
        return this.role;
    }

    public void setAuthority(String role){
        this.role = role;
    }
}
