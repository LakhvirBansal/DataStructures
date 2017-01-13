package com.java.codeSchool;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		String strArr[] = new String[totalNum];
		for (int i = 0; i < totalNum; i++) {
			Scanner s = new Scanner(System.in);
			String inputStr = s.next();
			StringBuilder sb = new StringBuilder(inputStr);
			System.out.println(sb.reverse().toString());
		}
	}
}
