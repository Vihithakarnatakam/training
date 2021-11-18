package com.ibm.Shopping;

public class ShoppingCart {
	
	private Product[] item;
	private double total;
	private int idx;
	

	public ShoppingCart() {
		item= new Product[5];
	}
 
	public void addcart(Product p)
	{
		item[idx]=p;
		idx++;
		total += p.getPrice();
		System.out.println(p.getName()+" added to cart");
		       
				
	}
	
	public void checkout()
	{
		System.out.println("your shopping cart");
		for(int i=0;i<idx;i++)
			item[i].description();
		System.out.println("cart total is: " +total);
		
	}
}
