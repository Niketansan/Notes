package com.pratice;

public class ConstructorExample {
	
	int a ;
	int b;
	
	ConstructorExample(int a , int b){
		this.a = a;
		this.b = b;
		System.out.println(" Example for  Default Constructor"+ a +" "+b);
	}
	
	public void adding() {
		System.out.println(a+ "Exmpale "+b);
	}
	
	public static void main(String[] args) {
		ConstructorExample  obj = new ConstructorExample(1,2);
		obj.adding();
		
	}
}
