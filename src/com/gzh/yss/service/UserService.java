package com.gzh.yss.service;

import java.util.Map;

import com.gzh.yss.pojo.User;

public interface UserService {
	public User getUser(Integer id);
	public void updateUaer(User user);
	public Map<String,Object> userMap(Integer lines,Integer rows);
	public void insertUser(User user);	
}
