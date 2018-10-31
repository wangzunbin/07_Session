package com.wangzunbin._01_loginandLogout.dao.impl;

import java.util.List;

import com.wangzunbin._01_loginandLogout.dao.IUserDAO;
import com.wangzunbin._01_loginandLogout.domain.User;
import com.wangzunbin._01_loginandLogout.template.JdbcTemplate;
import com.wangzunbin._01_loginandLogout.template.handler.BeanHander;

public class UserDAOImpl implements IUserDAO{

	@Override
	public void save(User user) {
		
	}

	@Override
	public void delete(Long userId) {
		
	}

	@Override
	public void update(User newUser, Long userId) {
		
	}

	@Override
	public User get(Long id) {
		return null;
	}

	@Override
	public List<User> list() {
		return null;
	}

	@Override
	public User checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "SELECT *FROM t_user WHERE username=? AND password=?";
		return JdbcTemplate.query(sql, new BeanHander<>(User.class), username, password);
	}

}
