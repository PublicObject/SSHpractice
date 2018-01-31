package com.gzh.yss.serviceImp;

import java.util.HashMap;
import java.util.Map;

import com.gzh.yss.dao.UserDao;
import com.gzh.yss.pojo.User;
import com.gzh.yss.service.UserService;

public class UserServiceImp implements UserService {
	private UserDao userDao;
	@Override
	public User getUser(Integer id) {
		User user = null;
		try {
			user = userDao.getUser(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return user;
	}

	@Override
	public void updateUaer(User user) {
		try {
			userDao.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;	
		}
	}

	@Override
	public Map<String, Object> userMap(Integer lines, Integer rows) {
		Map<String,Object> userMap = null;
		try {
			userMap = new HashMap<String, Object>();
			userMap = userDao.getInfo(lines, rows);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}		
		return userMap;
	}

	@Override
	public void insertUser(User user) {
		try {
			userDao.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
