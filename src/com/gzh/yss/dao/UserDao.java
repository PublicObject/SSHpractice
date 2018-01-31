package com.gzh.yss.dao;

import java.util.Map;

import com.gzh.yss.pojo.User;

public interface UserDao {
	//根据Id获取用户
	public User getUser(Integer id);
	//添加用户
	public void insertUser(User user);
	//更新用戶
	public void updateUser(User user);
	//分页获取用户信息
	public Map<String,Object> getInfo(Integer line,Integer rows);
}
