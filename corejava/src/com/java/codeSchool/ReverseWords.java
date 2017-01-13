package com.java.codeSchool;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		String strArr[] = new String[totalNum];
		for (int i = 0; i < totalNum; i++) {
			Scanner s = new Scanner(System.in);
			String inputStr = s.nextLine();
			strArr[i] = inputStr;
		}
		for (int i = 0; i < strArr.length; i++) {
			String inputStr = strArr[i];
			String[] splitString = inputStr.split(" ");
			StringBuilder sb = new StringBuilder("");
			for (int j = splitString.length-1; j >= 0; j--) {
				sb.append(splitString[j]+" ");
			}
			System.out.println(sb.toString());
		}
	}
}
