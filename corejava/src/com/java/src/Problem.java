package com.java.src;

import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] primeNumbers ={2,3,5,7};
		/*for (int i = 0; i < primeNumbers.length; i++) {
			System.out.println(primeNumbers[i]);
		}*/
		for (int i = 0; i < num; i++) {
			int no = sc.nextInt();
			a[i] = no;
		}
		for (int i = 0; i < a.length; i++) {
			int checkNumber = a[i];
			int count = 0;
			if(checkNumber > 8){
				while(checkNumber >= primeNumbers[3] && checkNumber > 0){
					count = checkNumber/primeNumbers[3];
					checkNumber = checkNumber % primeNumbers[3];
				}
				if(checkNumber == 1){
					checkNumber = checkNumber +7;
					count = count -1;
				}
			}
			  switch(checkNumber) {
		        case 8:
		        	count+=2;
		          break;
		        case 7:
		        	count+=1;
		          break;
		        case 6:
		        	count+=2;
		          break;
		        case 5:
		        	count+=1;
		          break;
		        case 4:
		        	count+=2;
		          break;
		        case 3:
		        	count+=1;
		          break;
		        case 2:
		        	count+=1;
		          break;
		      }
			System.out.println("the number is "+count);
		}
	}
}
