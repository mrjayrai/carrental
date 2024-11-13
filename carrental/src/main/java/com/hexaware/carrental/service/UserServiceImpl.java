package com.hexaware.carrental.service;
/*
 * @Author: Shreyasi Bagul
 * Description: Created Service Interface Implementation for User
 * Date: 9th Nov 24
 */
import java.util.List;

import com.hexaware.carrental.entity.User;

public class UserServiceImpl implements IUserService {

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(int userId, User updatedUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateUserCredentials(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
