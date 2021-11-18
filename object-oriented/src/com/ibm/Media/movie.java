package com.ibm.Media;

public class movie extends media {

	public movie() {
		super();
		
	}
	
	private String lang;

	public movie(String title, String gener,String lang) {
		super(title, gener);
		this.lang=lang;
	}

	@Override
	public void play() {
		
		super.play();
		System.out.println("language is: "+lang);
	}
	
	

}
