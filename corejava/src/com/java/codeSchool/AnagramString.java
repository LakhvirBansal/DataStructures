package com.java.codeSchool;

import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int numbers = s.nextInt();
        String[] strArr = new String[numbers];
        for (int i = 0; i < numbers; i++) {
        	Scanner sc = new Scanner(System.in);
    		String next = sc.nextLine();
    		strArr[i] = next;
        }
        for (int i = 0; i < strArr.length; i++) {
        	String[] bothWords = strArr[i].split(" ");
			String firstWord = bothWords[0];
			String secondWord = bothWords[1];
			int check = 0;
			if(firstWord.length() != secondWord.length()){
				System.out.println("No");
			}
			else{
				for (int j = 0; j < firstWord.length(); j++) {
					char ch = firstWord.charAt(j);
					if(secondWord.indexOf(ch) == -1){
						System.out.println("No");
						check++;
					}
					else{
						secondWord.replaceFirst(String.valueOf(ch),"");
					}
				}
				if(check == 0){
					System.out.println("yes");
				}
			}
		}
	}
}
