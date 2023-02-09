package com.pratice;

import java.util.*;

class UserInfo implements Comparable<UserInfo> {

	String userName;
	String firstName;
	String lastName;
	String address;
	int age;

	public UserInfo(String userName, String firstName, String lastName, String address, int age) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return age + "";
	}

	@Override
	public int compareTo(UserInfo o) {
		if (o.getAge() > o.getAge()) {

			return 0;
		}
		return -1;

	}

}

public class ScannerExample {

	public static void main(String[] args) {
		List<UserInfo> list = new ArrayList<>();

		list.add(new UserInfo("sairam", "a", "y", "123", 12));
		list.add(new UserInfo("Nikhil", "a", "y", "123", 15));

		Collections.sort(list, new Comparator<UserInfo>() {
			@Override
			public int compare(UserInfo o1, UserInfo o2) {

				if (o1.getAge() < o2.getAge()) {

					return 0;
				}
				return -1;

			}
		});
		


		System.out.println(list);

	}
}
