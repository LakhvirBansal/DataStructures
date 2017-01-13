package com.java.src;

public class B extends A {

	public static void display(){
		System.out.println("b class");
	}
	public static void main(String[] args) {
		A a = new B();
		a.display();
	}
}
