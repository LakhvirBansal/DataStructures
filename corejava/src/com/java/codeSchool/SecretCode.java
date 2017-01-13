package com.java.codeSchool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SecretCode {
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
			String alphabets = inputData.get(i);
			Map<Integer,Character> positionMap = new HashMap<Integer,Character>();
			for(int j = 0; j<alphabets.length();j++){
				positionMap.put(j+1,alphabets.charAt(j) );
			}
			String inputStr =inputData.get(i+1);
			i = i+2;
			for (int j = 0; j < inputStr.length(); ) {
				//char ch = inputStr.charAt(j);
				//int val = (int)ch - reverseNum;
				//System.out.print((char)val);
				int num = Integer.parseInt(inputStr.substring(j, j+1));
				j = j + 2;
				System.out.print(positionMap.get(num));
			}
			System.out.println();
		}
	}
}
