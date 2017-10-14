package com.dzkj.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dzkj.dao.IPersonDao;

/**
 * mybatis�������ݿ�Ĺ�����
 * @author Administrator
 *
 */
public class MybatisUtil {

	// �ṩ������ȡsession
	public static SqlSession openSession(){
		SqlSession session = null;
		try {
			InputStream in = 
				Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFacotry = 
				new SqlSessionFactoryBuilder().build(in);
			session = sessionFacotry.openSession(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	
	// ���巽����ȡָ��dao�ӿڵĴ�����
	public static Object getMapper(Class cls){
		SqlSession session = openSession();
		// ��ȡ�ӿڵĴ����࣬�����������ǽӿڵ�ʵ����
		return session.getMapper(cls);
	}
}
