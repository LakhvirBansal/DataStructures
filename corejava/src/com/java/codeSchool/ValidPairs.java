package com.java.codeSchool;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class ValidPairs {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no_of_test_cases = sc.nextInt();
		
		for (int no = 0; no < no_of_test_cases; no++) {
			
			int sum = 0;
			
			int NoOfShoes = sc.nextInt();
			Scanner s = new Scanner(System.in);
			String numbers = s.nextLine();
			String[] eachNumbers = numbers.split(" ");
			CopyOnWriteArrayList<String> numberList = new CopyOnWriteArrayList<String>(Arrays.asList(eachNumbers));
			for (String number : numberList) {
				char[] chars = number.toCharArray();
				char val = chars[0];
				char secondCh = chars[1];
				String matchString = "";
				if(secondCh == 'L'){
					matchString = String.valueOf(val) +"R";
				} else{
					matchString = String.valueOf(val) +"L";
				}
				if(numberList.contains(matchString)){
					numberList.remove(matchString);
					sum = sum + 1;
				}
				numberList.remove(number);
			}
			System.out.println("the matching pair is :"+ sum);
		}
		
  }

}
