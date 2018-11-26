package com.wangzunbin._01_loginandLogout.domain;

public class CartItem {

	// 唯一的标识
	private Long id;
	// 商品的名称
	private String name;
	// 商品的价格
	private Double price;
	// 商品的数量
	private Integer num;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "CartItem [id=" + id + ", name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	
	

}
