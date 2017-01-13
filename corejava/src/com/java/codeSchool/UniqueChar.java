package com.java.codeSchool;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueChar {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		System.out.println(totalNum);
		for (int i = 0; i < totalNum; i++) {
			String inputStr = sc.next();
			Map<Character,Integer> charMap = new HashMap<Character, Integer>();
			boolean check = false;
			for (int j = 0; j < inputStr.length(); j++) {
				char ch = inputStr.charAt(j);
				if(charMap.containsKey(ch)){
					check = true;
				}
				else{
					charMap.put(ch, 1);
				}
			}
			
			if(check){
				System.out.println("NOT UNIQUE");
			} else{
				System.out.println("UNIQUE");
			}
		}
		
	}
}
