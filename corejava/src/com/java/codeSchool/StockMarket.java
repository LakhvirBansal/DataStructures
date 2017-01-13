package com.java.codeSchool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StockMarket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numbers = s.nextInt();
		
		for (int i = 0; i < numbers; i++) {
			int noOfSteps = s.nextInt();
			String[] strArr = new String[noOfSteps];
			for(int j = 0; j<noOfSteps; j++){
				Scanner sc = new Scanner(System.in);
				String next = sc.nextLine();
				strArr[j] = next;
			}
			List<Integer> resultList = new ArrayList<Integer>();
			 for (int k = 0; k < strArr.length; k++) {
				 String[] rowData = strArr[k].split(" ");
				 if(Integer.parseInt(rowData[0]) == 1){
					 resultList.add(Integer.parseInt(rowData[1]));
				 }
				 if(Integer.parseInt(rowData[0]) == 2){
					 if(!resultList.isEmpty()){
						 resultList.remove(resultList.size() - 1);
					 }
				 }
				 if(Integer.parseInt(rowData[0]) == 3){
					List<Integer> duplicateList = new ArrayList<Integer>(resultList);
					if(!duplicateList.isEmpty()){
						 Collections.sort(duplicateList);
						System.out.println(duplicateList.get(0));
					}
				}
			}
		}
	}
}
