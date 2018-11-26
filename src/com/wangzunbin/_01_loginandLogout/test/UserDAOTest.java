package com.wangzunbin._01_loginandLogout.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

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
	
	@Test
	public void test1() {
		try {
			String encode = URLEncoder.encode("北京市", "UTF-8");
			String decode = URLDecoder.decode(encode, "UTF-8");
			System.out.println(encode);
			System.out.println(decode);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		String xmlString = "<html>" + "<head>" + "<title>dom4j解析一个例子</title>"
				+ "<script>" + "<username>yangrong</username>"
				+ "<password>123456</password>" + "</script>" + "</head>"
				+ "<body>" + "<result>0</result>" + "<form>"
				+ "<banlce>1000</banlce>" + "<subID>36242519880716</subID>"
				+ "</form>" + "</body>" + "</html>";
		System.out.println(xmlString);
	}
}
