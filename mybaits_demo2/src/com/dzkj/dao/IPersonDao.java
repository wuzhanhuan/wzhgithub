package com.dzkj.dao;

import com.dzkj.entity.Person;

public interface IPersonDao {
	
	// ���
	// ��������Ҫ��sql����idһ��
	// �����Ĳ������ͺ�sql���Ĳ������ͱ���һ��
	// �����ķ���ֵ���ͺ�sql���ķ���ֵ���ͱ���һ��
	public void save(Person person);
	
	//����sql��䶨����
	public void update(Person person);

	
}
