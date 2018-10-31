package com.wangzunbin._01_loginandLogout.dao;

import java.util.List;

import com.wangzunbin._01_loginandLogout.domain.User;

public interface IUserDAO {

	void save(User user);

	void delete(Long userId);

	void update(User newUser, Long userId);

	User get(Long id);

	List<User> list();
	
	/**
	 * 检查登陆
	 * @param username 用户名
	 * @param password 密码
	 */
	User checkLogin(String username, String password);
}
