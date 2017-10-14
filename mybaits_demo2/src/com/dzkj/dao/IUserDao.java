package com.dzkj.dao;

import java.util.List;
import java.util.Map;

import com.dzkj.entity.User;

public interface IUserDao {
	
	// ���
	public void save(User user);
	
	// ��ѯ����
	public List<User> queryAll();
	
	// ��¼
	public User login(Map map);

}
