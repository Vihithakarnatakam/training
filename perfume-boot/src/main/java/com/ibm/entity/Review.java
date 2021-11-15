package com.ibm.entity;

import javax.persistence.*;

@Entity
@Table(name="prod_review")
public class Review {
	@Id @GeneratedValue @Column(name="prod_id")
	private int revId;
	
	//Each review belongs to a user
	@ManyToOne
	@JoinColumn(name="userId") //joining the userId column (from Users java program) to this table
	private Users user;
	
	//Each review is about a product
	@ManyToOne
	@JoinColumn(name="prodId") //joining the prodId column (from Products java program) to this table
	private Products products;
	
	public int getRevId() {
		return revId;
	}

	public void setRevId(int revId) {
		this.revId = revId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getRevDesc() {
		return revDesc;
	}

	public void setRevDesc(String revDesc) {
		this.revDesc = revDesc;
	}

	@Column(length=30)
	private String title;
	
	@Column(length=30)
	private int rating;
	
	@Column(length=30)
	private String revDesc;
	
	//created at timestamp needs to be added
}
