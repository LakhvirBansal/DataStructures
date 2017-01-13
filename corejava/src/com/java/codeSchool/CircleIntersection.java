package com.java.codeSchool;

import java.util.Scanner;

public class CircleIntersection {
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
        	String[] wholeString = strArr[i].split(" ");
			int radius1 = Integer.parseInt(wholeString[0]);
			int radius2 = Integer.parseInt(wholeString[1]);
			int distance = Integer.parseInt(wholeString[2]);
			if(((radius1 + radius2) >= distance) && ((radius2 - radius1) <= distance) ){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

		}
	}
}
