package com.java.codeSchool;

import java.util.Scanner;

public class OddLucky {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		int numArr[] = new int[totalNum];
		for (int i = 0; i < totalNum; i++) {
			int number = sc.nextInt();
			numArr[i] = number;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			int No = numArr[i];
			int count = 0;
			int number = 0;
			while (count < No){
				for(int j = 1;;j++){
					int resultNo = j;
					if(j<10){
						if(j%10 == 1 || j%10 == 3 || j%10 == 5 || j%10 == 7 || j%10 == 9){
							count = count + 1;
							number = resultNo;
							if(count == No){
								break;
							}
						}
					} else{
						int k = j;
						while(k>10){
							if(k%10 == 1 || k%10 == 3 ||k%10 == 5 || k%10 == 7 || k%10 == 9){
								k = k/10;
							} else{
								break;
							}
							if(k < 10){
								if(k%10 == 1 || k%10 == 3 ||k%10 == 5 || k%10 == 7 || k%10 == 9){
									count = count + 1;
									if(count == No){
										number = resultNo;
										break;
									}
								}
								else{
									break;
								}
							}
							
						}
						
					}
					if(count == No){
						number = resultNo;
						break;
					}
			}
			}
			System.out.println(number);
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("execution time :"+executionTime);
	}
}
