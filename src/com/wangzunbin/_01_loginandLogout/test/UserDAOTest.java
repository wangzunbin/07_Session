package com.wangzunbin._01_loginandLogout.test;

import org.junit.Test;

import com.wangzunbin._01_loginandLogout.dao.IUserDAO;
import com.wangzunbin._01_loginandLogout.dao.impl.UserDAOImpl;
import com.wangzunbin._01_loginandLogout.domain.User;

public class UserDAOTest {

	IUserDAO dao = new UserDAOImpl();
	
	@Test
	public void testQuery() {
		
		User user = dao.checkLogin("wangzunbin", "123");
		System.out.println(user.toString());
	}
	
	
}
