package com.dzkj.test;

import java.util.HashMap;
import java.util.Map;

import com.dzkj.dao.IUserDao;
import com.dzkj.entity.User;
import com.dzkj.util.MybatisUtil;

public class Test3 {
	
	public static void main(String[] args) {
		// ��dao�������ô�����
		IUserDao dao = (IUserDao)MybatisUtil.getMapper(IUserDao.class);
//		User user = new User();
//		user.setUname("admin");
//		user.setUpwd("00000");
//		dao.save(user);
		// ��¼
		Map map = new HashMap();
		map.put("uname", "admin");
		map.put("upwd", "000001111");
		User user = dao.login(map);
		if (user == null) {
			System.out.println("��¼ʧ��");
		} else {
			System.out.println("��¼�ɹ�");
		}
	}

}
