package com.pratice;

import java.util.ArrayList;
import java.util.List;
class User{
	
	
	String userName;
	

	User(String userName){
		this.userName = userName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String  toString() {
		
		return userName;
	}
	
}
public class CollectionFrameworkEx {
	public static void main(String[] args) {
		
		
		User user = new User("sairam");
		User user1 = new User("sairam123");
		
		List<User> list4 = new ArrayList<>();
		
		list4.add(user);
		list4.add(user1);
		
		
		for( User li3  :list4) {
			System.out.println(li3.toString());
		}
		

		List list = new ArrayList();
		list.add(1);
		list.add(1.234);
		list.add("sairam");
		list.add('M');
		list.add(true);

		System.out.println(list);

		list.add(0, 123);

		System.out.println(list);

		List list2 = new ArrayList();
		list.add(1);
		list.add(1.234);

		list.addAll(list2);
		System.out.println(list);

		// list.clear();

		System.out.println(list.contains("nikhil"));

		System.out.println(list.get(0));

		System.out.println(list.indexOf(20));

		System.out.println(list.isEmpty());

		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.toString());

		List subList = list.subList(0, 2);
		System.out.println(subList);

	
		for(Object  obj :subList) {
		  System.out.println(obj);	
		}
		
		List<Integer>  list3 = new ArrayList<>();
		
		list3.add(1);
		list3.add(2);
		
		for(Integer li :list3) {
			System.out.println(li);
		}
		

	}


}
