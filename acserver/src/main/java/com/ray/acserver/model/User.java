package com.ray.acserver.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private Long ID;

    private String username;
    private String password;
    private String role;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
