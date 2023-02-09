package com.pratice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Demo implements Runnable{
	  @Override  
	    public void run() {  
		  
		  Thread t = Thread.currentThread();
	         
	    }  
	   
	
}
interface StringValidator {
	
	boolean test(String s) ;
	
	default boolean intialTest(String s) {
		
		return true;
	}
}
class GenericException extends Throwable{
	
}
class Test1{
	
	public int x;
	
	
	public Test1(int a) {
		 x=10;
	}
	public int getVal() {
		
		return x;
		
	}
}

public class StringExample {
	private static int i;
	
	static {
		i = 10 ;
		System.out.println("ssd");
	}
	

public static  Boolean test() {
	
	return null;
}
	public static void main(String[] args) {
		
		Boolean b = true ?  test() : false;
		System.out.println(b);
		
		
		
		
		Integer i = Integer.valueOf("1");
		
		if(i.toString() == "1") {
			 System.out.println("equal");
		}else {
			 System.out.println(" not equal");
		}
		
		String s ="JAVA";
		
		s = s+"rocks";
		s = s.substring(4,8);
		s.toUpperCase();
		System.out.println(s);
		
		int var =5;
		
		System.out.println(var++);
		System.out.println("\n"+ ++var);
	
		 Stream.of("a1","b1").filter(y ->y.startsWith("b")).map(z -> z.toUpperCase()).forEach(test->{
			 System.out.println(test+"rterreyrt");
		 });
		int res , x ;
		
		x =1;
		
		res =0;
		
		while(x<=10) {
			if(x%2 ==0) {
				
				res = res+x;
				
				
			}
			++x;
		}
		System.out.println(res+"sdgd");
		
		i = i+1;
		System.out.println("sfg"+i);
		
		List<String> l = new ArrayList<>();
		
		
		CopyOnWriteArrayList  ne = new  CopyOnWriteArrayList();
		
		
	
		
	//	BagList<String> l1 = l.stream().filter(x->x!=null).collect(Collectors.toList());
		
		l.add("1");
		l.add("2");
		l.add(1,"3");
		
		System.out.println(l);


		/*
		 * 
		 * 
		 * String constant pool
		 * 
		 * memory allocation
		 * 
		 * if values are same .. if represent the same object , it will not create
		 * different object
		 * 
		 * 
		 */


		String s1 = new String("sairam");

		String s3 = new String("sairam");

		System.out.println(s.charAt(0));

		char ch[] = s.toCharArray();

		if (s.isEmpty()) {

		}
		int a = 1;
		String s12 = s.valueOf(a);
		
		//mutable
		StringBuffer sb = new StringBuffer("test"); // synchorized  slow 
		
		sb.append("123");
	
		sb.reverse();
		
		System.out.println(sb.toString());
		
		
		//mutab;e
		StringBuilder sb1 = new StringBuilder("ertgrege");// non-synchriozed multiplethreads
		
		
		
		// reverse a string
		// each character count , a vowel count , duplicate character count , max
		// repated chaarcter

	}
}
