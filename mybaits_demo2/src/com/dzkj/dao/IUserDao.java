package com.dzkj.dao;

import java.util.List;
import java.util.Map;

import com.dzkj.entity.User;

public interface IUserDao {
	
	// 添加
	public void save(User user);
	
	// 查询所有
	public List<User> queryAll();
	
	// 登录
	public User login(Map map);

}
