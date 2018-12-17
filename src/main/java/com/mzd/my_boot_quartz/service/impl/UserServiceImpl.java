package com.mzd.my_boot_quartz.service.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mzd.my_boot_quartz.bean.User;
import com.mzd.my_boot_quartz.mapper.UserMapper;
import com.mzd.my_boot_quartz.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userDao;
	
	

	@Override
	public User findById(Integer id) {
		User user = new User();
		user.setId(id);
		user = userDao.findById(user);
		return user;
	}

	@Override
	public List<User> findUserList() {	
		return userDao.findUserList();
	}
	
	@Override
	public boolean deleteUserById(Integer id) {
		boolean bo =  true;
		try {
			bo = userDao.deleteUserById(id);
		} catch (Exception e) {
			bo = false;
			LOGGER.info("删除接口异常！");
		}
		return bo;
	}

	@Override
	public boolean updateUser(User user) {
		boolean bo =  true;
		String key = "user_" +user.getId();
		try {
			bo = userDao.updateUser(user);
		} catch (Exception e) {
			bo = false;
			LOGGER.info("更新接口异常！");
		}
		return bo;
	}

	@Override
	public boolean addUser(User user) {
		boolean bo =  true;
		try {
			bo = userDao.insertUser(user);
		} catch (Exception e) {
			bo = false;
			LOGGER.info("新增接口异常！");
		}
		return bo;
	}


}
