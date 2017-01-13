package com.java.codeSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleEncryption {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numbers = s.nextInt();
		List<String> inputData = new ArrayList<String>(2*numbers);
		for (int i = 0; i < numbers*2; i++) {
			Scanner sc = new Scanner(System.in);
			String next = sc.next();
			inputData.add(next);
		}
		for (int i = 0; i < inputData.size();) {
			int reverseNum = Integer.parseInt(inputData.get(i));
			String inputStr =inputData.get(i+1);
			i = i+2;
			for (int j = 0; j < inputStr.length(); j++) {
				char ch = inputStr.charAt(j);
				int val = (int)ch - reverseNum;
				System.out.print((char)val);
			}
			System.out.println();
		}
	}
}
