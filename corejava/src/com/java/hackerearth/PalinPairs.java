package com.java.hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PalinPairs {
	
	public static void main(String[] args) {
		long starTime = System.currentTimeMillis();
		Scanner scr = new Scanner(System.in);
		int noOfStrings = scr.nextInt();
		
		List<String> numbersList = new ArrayList<String>();
		long count = 0;
		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < noOfStrings; i++) {
			String inputString = scr.next();
			String reverseInputString = sb.append(inputString).reverse().toString();
			long countNumbers  = 0;
			if(numbersList.contains(reverseInputString)){
				countNumbers = Collections.frequency(numbersList, reverseInputString);
			}
			count = count + countNumbers;
			numbersList.add(inputString);
			sb.setLength(0);
		}
		
		System.out.println(count);
		long endTime = System.currentTimeMillis();
		long totalTime  = endTime - starTime;
		System.out.println(totalTime);
	}
}
