package com.java.codeSchool;

import java.util.Scanner;

public class FirstOccurance {
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
			int searchNumber = Integer.parseInt(inputString.split(" ")[1]);
			i++;
			String NumberList = strArr[i];
			String[] numbers = NumberList.split(" ");
			
			for (int j = 0; j < numbers.length; j++) {
				int number = Integer.parseInt(numbers[j]);
				if(searchNumber == number){
					System.out.println(j);
					break;
				}
				if(j == (numbers.length -1) ){
					System.out.println(-1);
				}
			}
		}
		
	}
}
