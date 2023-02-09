package com.pratice;


abstract class MobileUIAPI {

	public void getMobileUIVerison() {

		System.out.println("1.1.1");
	}

	public abstract int getScreenSize();


	public abstract String getColor(); // method declartiom
}

abstract class SamsungAPI extends MobileUIAPI {

	int screenSize;

	public SamsungAPI(int screenSize) {

		this.screenSize = screenSize;
	}
	

	public void getMobileUIVerison() {

		System.out.println("2.2.2");
	}

	@Override
	public int getScreenSize() {

		return screenSize;
	}

}

class SamsungF1Series extends SamsungAPI {

	String color;
	public SamsungF1Series(int screenSize,String color) {
		super(screenSize);
		this.color = color;
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}

class MIUI extends MobileUIAPI {

	int screenSize;
	String color;

	public MIUI(int screenSize, String color) {

		this.screenSize = screenSize;
		this.color = color;
	}

	public void getMobileUIVerison() {

		System.out.println("2.2.3");
	}

	
	@Override
	public int getScreenSize() {

		return screenSize;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}

public class AbstractionExample {

	public static void main(String[] args) {
		
		MobileUIAPI  sui = new SamsungF1Series(1,"RED");
		sui.getMobileUIVerison();
		System.out.println(sui.getScreenSize());
		System.out.println(sui.getColor());
		
		MobileUIAPI  mui = new MIUI(1,"YELLOW");
		
		mui.getMobileUIVerison();
		System.out.println(mui.getScreenSize());
		System.out.println(mui.getColor());

	}

}
