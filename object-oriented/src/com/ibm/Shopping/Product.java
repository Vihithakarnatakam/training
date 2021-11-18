package com.ibm.Shopping;

public class Product {
	
	private int code;
	private String name;
	private int price;
	private int stock;
	
	private static int gencode=100;

	public Product() {
		
	}


	public Product(String name, int price) {
		super();
		this.code = gencode++;
		this.name = name;
		this.price = price;
		this.stock = 10;
	}
	
	
		public void description()
	{
		System.out.println("product code: " +code);
		System.out.println("product name: " +name);
		System.out.println("product price: " +price);
		System.out.println("product stock: " +stock);
		
	}




		public String getName() {
			return name;
		}


		public int getPrice() {
			return price;
		}



		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}
	
		
}
