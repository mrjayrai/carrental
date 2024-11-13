package com.hexaware.carrental.service;
/*
 * @Author: Shreyasi Bagul 
 * Description: Created Service Interface for Users
 * Date: 9th Nov 24
 */
import java.util.List;

import com.hexaware.carrental.entity.User;

public interface IUserService {
	List<User> getAllUsers();
    User getUserById(int userId);
    boolean addUser(User user);
    boolean updateUser(int userId, User updatedUser);
    boolean deleteUser(int userId);
    User findByUsername(String username);
    boolean validateUserCredentials(String username, String password);
}
