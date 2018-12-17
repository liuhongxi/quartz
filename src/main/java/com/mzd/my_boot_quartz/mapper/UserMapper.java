package com.mzd.my_boot_quartz.mapper;
import java.util.List;

import com.mzd.my_boot_quartz.bean.User;


public interface UserMapper {

	User findById(User user);

	boolean updateUser(User user);

	boolean insertUser(User user);

	boolean deleteUserById(Integer id);
	
	List< User> findUserList();
}
