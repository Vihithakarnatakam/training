package com.ibm.entity;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
	@Id @GeneratedValue @Column(name="prod_id")
	private int prodId;
	
	@Column(length=30)
	private String prodName;
	
	//each product can have MORE THAN 1 reviews
	@OneToMany(mappedBy = "products") //on line "17" in review entity
	private List<Review> revPid;
	
	//each product can be in order items
	@OneToMany(mappedBy = "products") //on line "17" in orderItem entity
	private List<OrderItem> itemPid;
	
	@Column(length=30)
	private String prodDesc;
	
	@Column(length=30)
	private String type; //category
	
	@Column(length=30)
	private int sku;
	
	@Column(length=30)
	private int price;
	
	@Column(length=30)
	private int discount;
	
	@Column(length=30)
	private int quantity;
	
	@Column(length=30)
	private int summary;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public List<Review> getRevPid() {
		return revPid;
	}

	public void setRevPid(List<Review> revPid) {
		this.revPid = revPid;
	}

	public List<OrderItem> getItemPid() {
		return itemPid;
	}

	public void setItemPid(List<OrderItem> itemPid) {
		this.itemPid = itemPid;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSummary() {
		return summary;
	}

	public void setSummary(int summary) {
		this.summary = summary;
	}
}
