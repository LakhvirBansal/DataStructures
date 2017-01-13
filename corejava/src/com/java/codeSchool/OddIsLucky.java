package com.java.codeSchool;

import java.util.Scanner;

public class OddIsLucky {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		int numArr[] = new int[totalNum];
		for (int i = 0; i < totalNum; i++) {
			int number = sc.nextInt();
			numArr[i] = number;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			int no = numArr[i];
			int index = 0;
			int number = 0;
			while (index != no){
				number++;
				if(isLucky(number))
					index++;
			}
			System.out.println(number);
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("execution time :"+executionTime);
	}

	private static boolean isLucky(int number) {
		if(number == 0){
			return false;
		}
		while(number != 0){
			if(number%2 == 0){
				return false;
			}
			number = number/10;
		}
		return true;
	}
}
