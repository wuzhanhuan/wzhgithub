package com.dzkj.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dzkj.dao.IPersonDao;

/**
 * mybatis操作数据库的工具类
 * @author Administrator
 *
 */
public class MybatisUtil {

	// 提供方法获取session
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
	
	// 定义方法获取指定dao接口的代理类
	public static Object getMapper(Class cls){
		SqlSession session = openSession();
		// 获取接口的代理类，这个代理类就是接口的实现类
		return session.getMapper(cls);
	}
}
