package com.wangzunbin._01_loginandLogout.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangzunbin._01_loginandLogout.domain.CartItem;
import com.wangzunbin._01_loginandLogout.template.ShoppingCart;

@WebServlet("/productlist")
public class ProductListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -821692435425354703L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		name = new String(name.getBytes("ISO8859-1"), "UTF-8");
		String num = req.getParameter("num");
	
		// 调用业务方法处理请求
		// 从session中取出购物车对象
		ShoppingCart cart = (ShoppingCart) req.getSession().getAttribute("SHOPPINGCART_IN_SESSION");
		// 如果为null, 创建一个新的购物车, 并且放到session中
		if (cart == null) {
			cart = new ShoppingCart();
			req.getSession().setAttribute("SHOPPINGCART_IN_SESSION", cart);
		}
		// 封装商品的数据
		CartItem cartItem = new CartItem();
		cartItem.setName(name);
		cartItem.setNum(Integer.valueOf(num));
		if ("电脑".equals(name)) {
			cartItem.setId(111L);
			cartItem.setPrice(10000D);
		} else if ("手机".equals(name)) {
			cartItem.setId(222L);
			cartItem.setPrice(20000D);
		} else if ("PAD".equals(name)) {
			cartItem.setId(333L);
			cartItem.setPrice(30000D);
		}
		cart.save(cartItem);
		System.out.println(cart.getItems());
		req.getRequestDispatcher("/shoppingcart/cart.jsp").forward(req, resp);
	}
}
