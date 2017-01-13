package com.java.hackerearth;

import java.util.Scanner;

public class BirthdayParty {
	public static void main(String[] args) {
		//long starTime = System.currentTimeMillis();
		Scanner scr = new Scanner(System.in);
		int noOfTestCases = scr.nextInt();
		for (long i = 0; i < noOfTestCases; i++) {
			//Scanner sc = new Scanner(System.in);
			String friendsAndDishValue = scr.nextLine();
			System.out.println("the value is "+friendsAndDishValue);
			int noOfFriends = Integer.parseInt(friendsAndDishValue.split(" ")[0]);
			int noOfdishes = Integer.parseInt(friendsAndDishValue.split(" ")[1]);
			
			int count = 0;
			for (int j = 0; j < noOfFriends; j++) {
				if(count == noOfdishes){
					break;
				}
				String likeOrdisLikeString = scr.next();
				if(likeOrdisLikeString.length() == noOfdishes){
					for (int k = 0; k < likeOrdisLikeString.length(); k++) {
						char ch = likeOrdisLikeString.charAt(k);
						if(ch == '1'){
							count++;
						}
					}
				}
				
			}
			System.out.println(count);
		}
	}

}
