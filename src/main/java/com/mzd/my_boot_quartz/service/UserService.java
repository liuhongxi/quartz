package com.mzd.my_boot_quartz.service;

import java.util.List;

import com.mzd.my_boot_quartz.bean.User;


public interface UserService {
	
	User findById(Integer id);
	
	boolean deleteUserById(Integer id);
	
	boolean updateUser(User user);
 
	boolean addUser(User user);
	
	List< User> findUserList();
}
