package com.dzkj.test;

import org.apache.ibatis.session.SqlSession;

import com.dzkj.dao.IPersonDao;
import com.dzkj.entity.Person;
import com.dzkj.util.MybatisUtil;

public class Test {
	
	public static void main(String[] args) {
//		SqlSession session = MybatisUtil.openSession();
//		
//		// mybatis���Զ�����dao�ӿڵ�ʵ���࣬���ʵ������������࣬���������ʵ����dao�ӿڡ�
//		// getMapper��ȡָ���ӿڵĴ�����
//		// 1��ͨ��ָ���ӿڵ�class�Ϳ��Ի�ȡ���ӿڵ�����·����
//		// 2������namespance��ֵ�ͽӿڵ�����·����һ������˿���ͨ������·�����ҵ��ӿڶ�Ӧ��sqlӳ���ļ�
//		IPersonDao dao = session.getMapper(IPersonDao.class);
//		
//		
//		Person person = new Person(0,"111","Ů",33,"3333");
//		dao.save(person);
		
		IPersonDao dao = (IPersonDao)MybatisUtil.getMapper(IPersonDao.class);
		Person person = new Person(0,"111","Ů",33,"3333");
		dao.save(person);
	}

}
