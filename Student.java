package com.javapratice.demo;

public class Student {

	// instance variables
	int id;

	String name;

	boolean pass;

	public String getStudentName(String name) {

		return name.toUpperCase();
	}

	public boolean verifytheName(String name) {

		if (name == null) {

			return false;
		}

		if (name.length() < 4) {

			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		Student s = new Student();

		s.id = 1;
		s.pass = true;

		boolean verified = s.verifytheName(s.name);

		System.out.println(verified);

		if (verified) {
			System.out.println("It is verified successfully");
		} else if (s.name != null) {
			System.out.println("It  verified succesfully but lenngth is not zero");
		} else {
			System.out.println("it is not verified");
		}

		Student s1 = new Student();

		s1.id = 2;
		s1.name = "ram";
		s1.pass = true;

		String upperCaseName = s1.getStudentName(s1.name);

		System.out.println(upperCaseName);

	}

}
