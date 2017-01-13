package com.java.codeSchool;

import java.util.Scanner;

public class CountingInversion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		String[] strArr = new String[testcases * 2];
		for (int i = 0; i < testcases*2; i++) {
			Scanner sc = new Scanner(System.in);
			String next = sc.nextLine();
			strArr[i] = next;
		}
			
		for (int i = 0; i < strArr.length; i++) {
			String inputString = strArr[i];
			int totalNumbers = Integer.parseInt(inputString);
			i++;
			String NumberList = strArr[i];
			String[] numbers = NumberList.split(" ");
			
			int count = 0;
			int previousNumber  = 0;
			for (int j = 0; j < numbers.length; j++) {
				if(j >= 1){
					int number = Integer.parseInt(numbers[j]);
					if(previousNumber > number){
						count = count + 1;
					}
					previousNumber = number;
				}
				else{
					int number = Integer.parseInt(numbers[j]);
					previousNumber = number;
				}
			}
			
			System.out.println(count);
		}
		
	}
}
