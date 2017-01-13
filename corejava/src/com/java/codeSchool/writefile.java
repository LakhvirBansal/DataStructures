package com.java.codeSchool;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class writefile {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		String fileName = "E:/abc.txt";
		String fileName2 = "E:/abcd.txt";
		for(int i = 0;i<=1;i++){
			PrintWriter writer = null;
			if(i==0){
				writer = new PrintWriter(fileName, "UTF-8");
			}
			else{
				writer = new PrintWriter(fileName2, "UTF-8");
			}
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
		}
		
	}
	
}
