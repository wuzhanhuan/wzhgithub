package com.dzkj.test;

import org.apache.ibatis.session.SqlSession;

import com.dzkj.dao.IPersonDao;
import com.dzkj.entity.Person;
import com.dzkj.util.MybatisUtil;

public class Test2 {
	
	public static void main(String[] args) {
		SqlSession session = MybatisUtil.openSession();
		// 获取接口的代理类，这个代理类就是接口的实现类
		IPersonDao dao = session.getMapper(IPersonDao.class);
		// 修改
		Person person = new Person(8, "鬼几愁", "女",0, "");
		dao.update(person);
	}

}
