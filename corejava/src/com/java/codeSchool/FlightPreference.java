package com.java.codeSchool;

import java.util.Scanner;

public class FlightPreference {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		
		for (int i = 0; i < testcases; i++) {
			
			int noOfLines = s.nextInt();
			String[] inputStrings = new String[noOfLines];
			for (int j = 0; j < noOfLines; j++) {
				Scanner sc = new Scanner(System.in);
				String inputString = sc.nextLine();
				inputStrings[j] = inputString;
			}
			
			String[] arrayAfterSortByPrice = new String[inputStrings.length];
			
			for (int j = 0; j < inputStrings.length; j++) {
				String inputString = inputStrings[j];
				if(j == 0){
					arrayAfterSortByPrice[j] = inputString;
				} else{
					long flightPrice = Long.parseLong(inputString.split(" ")[3]);
					for (int k = 0; k < j; k++) {
						if(flightPrice < Long.parseLong(arrayAfterSortByPrice[k].split(" ")[3])){
							swapArray(k,arrayAfterSortByPrice.length,arrayAfterSortByPrice);
							arrayAfterSortByPrice[k] = inputString;
						}
						else{
							arrayAfterSortByPrice[k] = inputString;
						}
					}
				}
				
			}
			for (int j = 0; j < arrayAfterSortByPrice.length; j++) {
				System.out.println(arrayAfterSortByPrice[j]);
			}
			
		}
			
		
	}

	private static void swapArray(int k, int length, String[] arrayAfterSortByPrice) {
		for (int i = length -1 ; i > k; i--) {
			arrayAfterSortByPrice[i] = arrayAfterSortByPrice[i-1];
		}
		
	}
}
