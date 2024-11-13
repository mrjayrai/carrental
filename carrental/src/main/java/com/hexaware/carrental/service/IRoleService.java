package com.hexaware.carrental.service;
/*
 * @Author: Pritesh Rai 
 * Description: Created Service Interface for Roles
 * Date: 9th Nov 24
 */
import java.util.List;

import com.hexaware.carrental.entity.Role;

public interface IRoleService {
	List<Role> getAllRoles();
	Role getRoleById(int roleId);
	boolean addRole(Role role);
	boolean updateRole(int roleId,Role updateRole);
	boolean deleteRole(int roleId);
}
