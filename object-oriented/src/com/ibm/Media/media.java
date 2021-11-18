package com.ibm.Media;

public class media {

	public media() {
		
	}
	private String title;
	private String gener;
	public media(String title, String gener) {
		
		this.title = title;
		this.gener = gener;
	}
	public void play()
	{
		System.out.println("The title is: "+title);
		System.out.println("The gener is: "+gener);
		
	}
	
	public static void main(String args[])
	{
		media m = new media("avengers","thriller");
		m.play();
		
		movie mm=new movie("KGF","suspense","kannada");
		mm.play();
		
		series s = new series("bold type","lifestyle",3);
		s.play();
	}

}
