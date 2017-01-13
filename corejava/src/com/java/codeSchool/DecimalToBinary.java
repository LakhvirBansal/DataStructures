package com.java.codeSchool;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		int numArr[] = new int[totalNum];
		for (int i = 0; i < totalNum; i++) {
			int number = sc.nextInt();
			numArr[i] = number;
		}
		for (int i = 0; i < numArr.length; i++) {
			int num = numArr[i];
			StringBuilder returnStr = new StringBuilder("");
			while(num > 1){
				if(num % 2 == 0){
					returnStr = returnStr.append("0");
				}
				else{
					returnStr = returnStr.append("1");
				}
				num = num/2;
			}
			if(num == 1){
				returnStr = returnStr.append("1");
			}
			if(num == 0){
				returnStr = returnStr.append("0");
			}
			System.out.println(returnStr.reverse().toString());
		}
	}
}
