package com.java.codeSchool;

import java.util.Scanner;

public class BookingUrShow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCase = sc.nextInt();
		 String[] strArr = new String[noOfTestCase];
		for (int i = 0; i < noOfTestCase; i++) {
			//System.out.println("sdfsbsdf,h mnsdh ");
			Scanner s = new Scanner(System.in);
			String inputData = s.nextLine();
			strArr[i] = inputData;
			
			
		}
		for (int i = 0; i < strArr.length; i++) {
			String[] allWords = strArr[i].split(" ");
			int noOfRows = Integer.parseInt(allWords[0]);
			int noOfColumns = Integer.parseInt(allWords[1]);
			int findDataCount = Integer.parseInt(allWords[2]);
			
			int count = 0;
			for (int j = 0; j < noOfRows; j++) {
				/*System.out.println("insert Row :"+(j+1));*/
				String inputString = sc.next();
				if(inputString.length() == noOfColumns){
					int findMatch = 0;
					for (int k = 0; k < inputString.length(); k++) {
						char ch = inputString.charAt(k);
						if(ch =='A'){
							findMatch = findMatch + 1;
						} else{
							findMatch = 0;
						}
						if(findMatch == findDataCount){
							count = count +1;
							findMatch = findMatch - 1;
						}
						
					}
				}
				
			}
			
			System.out.println(count);
		}
		sc.close();		
	}
}
