package com.hexaware.carrental.entity;

import java.time.LocalDateTime;

public class User {
    private Integer userId;
    private String email;
    private String password;
    private String phoneNumber;
    private Integer role;
    private LocalDateTime createdAt;

    
    public User() {
        super();
    }

    
    public User(Integer userId, String email, String password, String phoneNumber, Integer role, LocalDateTime createdAt) {
        super();
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.createdAt = createdAt;
    }

    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // toString() Method
    @Override
    public String toString() {
        return "User [userId=" + userId + ", email=" + email + ", password=" + password
                + ", phoneNumber=" + phoneNumber + ", role=" + role + ", createdAt=" + createdAt + "]";
    }
}
