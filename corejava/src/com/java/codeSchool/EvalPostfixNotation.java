package com.java.codeSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvalPostfixNotation {
	
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
			String evalString = strArr[i];
			double evalValue = 0;
			List<Double> charList = new ArrayList<Double>();
			for (int j = 0; j < evalString.length(); j++) {
				char ch = evalString.charAt(j);
				if(ch !='+' && ch !='-' && ch !='*' && ch !='/'){
					charList.add((double) (ch - '0'));
				}
				else{
					int listSize = charList.size();
					double LastNumber = charList.get((listSize -1));
					double secondLastNo = charList.get((listSize -2));
					charList.remove((listSize -1));
					charList.remove((listSize -2));
					double evalData = 0;
					if(ch =='+')
						evalData = secondLastNo + LastNumber;
					if(ch =='-')
						evalData = secondLastNo - LastNumber;
					if(ch =='*')
						evalData = secondLastNo * LastNumber;
					if(ch =='/')
						evalData = secondLastNo / LastNumber;
					charList.add(evalData);
				}
			}
			evalValue = charList.get(0);
			System.out.println(evalValue);
		}
		sc.close();		
	}

}
