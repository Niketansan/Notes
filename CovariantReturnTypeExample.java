package com.pratice;
class A {

	public Object add() {
		System.out.println("Adding 1");
		return null;
	}
	
	public void sub() {
		System.out.println(" Substarction");
	}

}

class B extends A {

	public B add() {
		System.out.println("Adding 2");
		return null;
	}
	
	public void multi() {
	
		System.out.println("multi 2");
	}
	
}

public class CovariantReturnTypeExample {
	public static void main(String[] args) {
		B b = new B();
		b.add();
		b.sub();
		b.multi();
	
		System.out.println(b.hashCode());
		/*
		 * The covariant return type specifies that the return type may vary in the same
		 * direction as the subclass.
		 * 
		 * Before Java5, it was not possible to override any method by changing the
		 * return type. But now, since Java5, it is possible to override method by
		 * changing the return type if subclass overrides any method whose return type
		 * is Non-Primitive but it changes its return type to subclass type.
		 * 
		 * Object --class predefined
		 * 
		 * it is parent class for the all class. It has few methods we can those
		 * methods(equals(), hashcode() etc).
		 * 
		 * 
		 */

	}

}