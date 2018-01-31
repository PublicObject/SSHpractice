package com.gzh.yss.action;


import java.util.Map;

import com.gzh.yss.pojo.User;
import com.gzh.yss.service.UserService;
import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	private User user;
	private UserService userService;
	private Integer lines;
	private Integer rows;
	public String getUserById(){
		try {
			User userInfo = userService.getUser(user.getId());
			Map<String,Object> req = (Map<String, Object>)ActionContext.getContext().get("request");
			req.put("user", userInfo);		
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "list";
	}
	public String insertUser(){
		try {
			userService.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "list";
	}
	public String updateUser(){
		try {
			userService.updateUaer(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "list";
	}
	public String getInfo(){
		try {
			Map<String, Object> userMap = userService.userMap(lines, rows);
			Map<String,Object> req = (Map<String, Object>)ActionContext.getContext().get("request");
			req.put("userMap", userMap);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "list";
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public Integer getLines() {
		return lines;
	}
	public void setLines(Integer lines) {
		this.lines = lines;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
