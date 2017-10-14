package com.dzkj.dao;

import com.dzkj.entity.Person;

public interface IPersonDao {
	
	// 添加
	// 方法名称要和sql语句的id一致
	// 方法的参数类型和sql语句的参数类型保持一致
	// 方法的返回值类型和sql语句的返回值类型保持一致
	public void save(Person person);
	
	//根据sql语句定方法
	public void update(Person person);

	
}
