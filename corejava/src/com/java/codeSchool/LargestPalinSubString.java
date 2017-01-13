package com.java.codeSchool;

import java.util.Scanner;

public class LargestPalinSubString {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		System.out.println(totalNum);
		for (int i = 0; i < totalNum; i++) {
			String inputStr = sc.next();
			int count = 0;
			for (int j = 0; j < inputStr.length()/2; j++) {
				if(inputStr.charAt(j) == inputStr.charAt(inputStr.length()-(j+1))){
					count = count + 2;
				} else{
					
				}
			}
			
			
			if(count == 0){
				System.out.println("NOT UNIQUE");
			} else{
				System.out.println("UNIQUE");
			}
		}
		
	}
}
