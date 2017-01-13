package com.java.src;

public class StringSplit {

	public static void main(String[] args) {
		System.out.println();
		String str= "kailash/chand/sani/lucky.pdf";
		str = str.replace(str.substring(str.lastIndexOf("/")+1, str.length()), "xxc");
		System.out.println(str);
		
		/*String str= "kailash/chand/sani/lucky.pdf";
		  String[] splitArr = str.split("/");
		  
		  str = str.replace(splitArr[splitArr.length -1 ], "abc");
		  System.out.println(str);*/
	}
}
