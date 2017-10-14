package com.dzkj.test;

import org.apache.ibatis.session.SqlSession;

import com.dzkj.dao.IPersonDao;
import com.dzkj.entity.Person;
import com.dzkj.util.MybatisUtil;

public class Test {
	
	public static void main(String[] args) {
//		SqlSession session = MybatisUtil.openSession();
//		
//		// mybatis会自动生成dao接口的实现类，这个实现类叫做代理类，这个代理类实现了dao接口。
//		// getMapper获取指定接口的代理类
//		// 1、通过指定接口的class就可以获取到接口的完整路径名
//		// 2、由于namespance的值和接口的完整路径名一样，因此可以通过完整路径名找到接口对应的sql映射文件
//		IPersonDao dao = session.getMapper(IPersonDao.class);
//		
//		
//		Person person = new Person(0,"111","女",33,"3333");
//		dao.save(person);
		
		IPersonDao dao = (IPersonDao)MybatisUtil.getMapper(IPersonDao.class);
		Person person = new Person(0,"111","女",33,"3333");
		dao.save(person);
	}

}
