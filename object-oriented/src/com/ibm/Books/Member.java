package com.ibm.Books;
public class Member {
	private String name;
	private Book bk;
	
	public Member(String name) 
	{
		
		this.name = name;
	}
	
	public void status()
	{
		if(bk==null)
		     System.out.println(name+ " has not issued the book");
		else
			System.out.println(name+" had issued the book of "+bk.getTittle());
		
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

	public String getName() {
		return name;
	}

	

}
