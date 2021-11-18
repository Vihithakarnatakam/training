package com.ibm.Media;

public class series extends media {

	public series() {
		super();
		
	}
private int seasons;
	public series(String title, String gener,int seasons) {
		super(title, gener);
		this.seasons=seasons;
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.play();
		System.out.println("Season is:"+seasons);
	}
	
	

}
