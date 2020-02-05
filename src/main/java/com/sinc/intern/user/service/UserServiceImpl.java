package com.sinc.intern.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.intern.user.model.sql.UserDao;

// service annotation을 통해 해당 클래스가 service class임을 명시.
// 괄호 안에 별칭 넣을 수 있다.
@Service("userS")
public class UserServiceImpl implements UserService {
	
	@Resource(name="userD")
	private UserDao dao;
	
	@Override
	public Object login(Object obj) {
		System.out.println("user service login : " + obj);
		return dao.loginRow(obj);
	}

}
