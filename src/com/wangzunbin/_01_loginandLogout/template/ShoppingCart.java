package com.wangzunbin._01_loginandLogout.template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wangzunbin._01_loginandLogout.domain.CartItem;

/**
 * 购物车对象
 * @author Administrator
 *
 */
public class ShoppingCart {

	private List<CartItem> items = new ArrayList<>();
	// 商品的总价
	private Double totalPrice;
	
	// 增加商品
	public void save(CartItem item) {
		// 如果要添加的商品在购物车中已经存在, 就只需要修改他的数量
		for (CartItem cartItem : items) {
			if (item.getId().equals(cartItem.getNum())) {
				cartItem.setNum(cartItem.getNum() + item.getNum());
				return;
			}
		}
		// 反之, 就添加一个新的元素
		items.add(item);
	}
	
	// 删除商品
	public void delete(Long id) {
		Iterator<CartItem> iterator = items.iterator();
		while (iterator.hasNext()) {
			CartItem item = iterator.next();
			if (item.getId().equals(id)) {
				iterator.remove();
			}
		}
	}
	
	// 获取所有商品
	public List<CartItem> getItems() {
		return items;
	}
}
