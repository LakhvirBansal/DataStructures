package com.java.codeSchool;
import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	    	int totalNum = sc.nextInt();
			int numArr[] = new int[totalNum];
			for (int i = 0; i < totalNum; i++) {
				int number = sc.nextInt();
				numArr[i] = number;
			}
			for (int i = 0; i < numArr.length; i++) {
				int sum = 0;
				StringBuilder sb = new StringBuilder("");
				sb.append("1 ");
				sum = sum + 1;
				int number = numArr[i];
				for(int j = 2;j<=Math.sqrt(number);j++){
					if(number% j == 0){
						int anotherNum = number/j;
						sb.append(j+" ");
						sum = sum + j;
						if(anotherNum != j){
							sb.append(anotherNum+" ");
							sum = sum + anotherNum;
						}
					}
				}
				if(number != 1){
					sb.append(numArr[i]);
					sum = sum + numArr[i]; 
				}
				System.out.println(sum);
			}
	}
}
