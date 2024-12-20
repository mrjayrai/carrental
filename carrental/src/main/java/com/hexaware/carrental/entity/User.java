package com.hexaware.carrental.entity;
/*
 * @Author: Shreyasi Bagul
 * Description: Created POJO class for Users
 * Date: 9th Nov 24
 */
import java.time.LocalDateTime;

public class User {
    private int userId;
    private String email;
    private String password;
    private String phoneNumber;
    private int role;
    private LocalDateTime createdAt;

    
    public User() {
        super();
    }


	public User(int userId, String email, String password, String phoneNumber, int role, LocalDateTime createdAt) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.createdAt = createdAt;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
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


	public int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", role=" + role + ", createdAt=" + createdAt + "]";
	}

    
    
}
