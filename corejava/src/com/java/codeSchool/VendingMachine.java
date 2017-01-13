package com.java.codeSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no_of_test_cases = sc.nextInt();
		
		for (int no = 0; no < no_of_test_cases; no++) {
			
			boolean b = false;
			int sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			
			int totalCoin = sc.nextInt();
			int itemPrice = sc.nextInt();
			
			for (int i = 1; i <= totalCoin; i++) {
				int coinValue = sc.nextInt();
				list.add(coinValue);
			}
			
			int size = list.size();
			for (int i = 0; i < size; i++) {
				
				for (int j = 0; j < size; j++) {
					
					if (j == i) {
						continue;
					}
					int val = list.get(j);
					
					if (val == itemPrice) {
						b = true;
						break;
					}
					
					if (val < itemPrice) {
						
						sum = sum + val;
						
						if (sum > itemPrice) {
							sum = sum - val;
						}
						
						if (itemPrice == sum) {
							b = true;
							break;
						} else {
							b = false;
						}
					}
					
				}
				if (b) {
					break;
				}
			}
			if (b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
  }

}
