package com.dzkj.test;

import org.apache.ibatis.session.SqlSession;

import com.dzkj.dao.IPersonDao;
import com.dzkj.entity.Person;
import com.dzkj.util.MybatisUtil;

public class Test2 {
	
	public static void main(String[] args) {
		SqlSession session = MybatisUtil.openSession();
		// ��ȡ�ӿڵĴ����࣬�����������ǽӿڵ�ʵ����
		IPersonDao dao = session.getMapper(IPersonDao.class);
		// �޸�
		Person person = new Person(8, "����", "Ů",0, "");
		dao.update(person);
	}

}
