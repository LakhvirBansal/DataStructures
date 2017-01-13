package com.java.src;

import java.util.Scanner;

public class StringAlternate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfStrings = sc.nextInt();
		
		for (int i = 0; i < noOfStrings; i++) {
			String checkString = sc.next();
			
			int numberCount = 0;
			int checkStringLength = checkString.length();
			for (int j = 0; j < checkStringLength; j++) {
				
				char ch = checkString.charAt(j);// char at j position
				
				if(j < (checkStringLength-1)){
					
					char nextCh = checkString.charAt(j + 1); // char at j+1 position
					if(ch == nextCh){ // if both are equal count is incremented by 1
						numberCount = numberCount + 1;
					}
					
				}
			}
			
			System.out.println("the number count for :"+checkString+": is :"+numberCount);
		}
	}
}
