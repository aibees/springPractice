package com.sinc.intern.user.model.sql;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("userD")
public class UserDaoImpl implements UserDao {

	public static final String PREFIX = "com.sinc.intern.test";
	
	//@Autowired
	@Resource(name="sqlSession")
	private SqlSession session;
	
	@Override
	public Object loginRow(Object obj) {
		System.out.println("user dao loginRow : " + obj);
		System.out.println("user dao conn : " + session);
		
		// arg0 : sql문을 찾는 키값 | arg1 : Object(value)
		Object result = session.selectOne(PREFIX + ".login", obj);
		
		System.out.println("dao loginRow result : " + result);
		return result;
	}

}
