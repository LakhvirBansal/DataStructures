package com.java.src;

public class Test {
	public static void main(String[] args) {
		String regex = "/\\d+";
		System.out.println(regex);
		String adsk = "\\d+";
		System.out.println(adsk.matches(regex));
		
	}
}
