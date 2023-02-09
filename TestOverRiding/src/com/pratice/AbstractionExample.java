package com.pratice;


abstract class MobileUIAPI {
	
	MobileUIAPI(){
		System.out.println("Test");
	}

	public void getMobileUIVerison() {

		System.out.println("1.1.1");
	}
	
	public static void getButtonInfo() {
		System.out.println(" Blue Red ");
	}
	
	public final void test() {
		System.out.println("Test123");
	}

	public abstract String getSugarLevel();

	public abstract String getColor(); // method declartiom
}

abstract class SamsungAPI extends MobileUIAPI {

	String  sugarLevel;

	public SamsungAPI(String sugarLevel) {

		this.sugarLevel = sugarLevel;
	}
	

	public void getMobileUIVerison() {

		System.out.println("2.2.2");
	}


	public String  getSugarLevel() {

		return sugarLevel;
	}
	
	
	
	public void getReceptiDetails() {
		
		System.out.println("SugRlevel "+sugarLevel);
	}

}

class SamsungF1Series extends SamsungAPI {

	String color;
	public SamsungF1Series(String screenSize,String color) {
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

	String sugarLevel;
	String color;

	public MIUI(String  sugarLevel, String color) {

		this.sugarLevel = sugarLevel;
		this.color = color;
	}

	public void getMobileUIVerison() {

		System.out.println("2.2.3");
	}

	

	public String  getSugarLevel() {

		return sugarLevel;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}

public class AbstractionExample {

	public static void main(String[] args) {
		
		MobileUIAPI  sui = new SamsungF1Series("HIGH","RED");
		sui.getMobileUIVerison();
		System.out.println(sui.getSugarLevel());
		System.out.println(sui.getColor());
		sui.test();
		
		MobileUIAPI  mui = new MIUI("LOW","YELLOW");
		
		mui.getMobileUIVerison();
		System.out.println(mui.getSugarLevel());
		System.out.println(mui.getColor());
		
		MobileUIAPI.getButtonInfo();

	}

}
