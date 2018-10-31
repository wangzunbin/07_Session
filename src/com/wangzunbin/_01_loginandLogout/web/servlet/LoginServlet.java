package com.wangzunbin._01_loginandLogout.web.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangzunbin._01_loginandLogout.dao.IUserDAO;
import com.wangzunbin._01_loginandLogout.dao.impl.UserDAOImpl;
import com.wangzunbin._01_loginandLogout.domain.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	IUserDAO dao = new UserDAOImpl();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9213420208147183582L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("username:" + username + ", password:" + password);
		User user = dao.checkLogin(username, password);
		System.out.println(user);
		if (Objects.isNull(user)) {
			req.setAttribute("errorMsg", "亲, 用户名或者密码错误");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return;
		}
		req.getSession().setAttribute("USER_IN_SESSION", user);
		resp.sendRedirect("/product.jsp");
	}
}
