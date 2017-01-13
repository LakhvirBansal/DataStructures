package com.java.src;

import org.apache.commons.lang.StringUtils;

public class Acid {
	public static void main(String[] args) {
		String s ="sdnkdbsdsbddd";
	//	s = s.replace("d","");
		//System.out.println(s);
		int count = StringUtils.countMatches("engineeering", "ee");
		System.out.println("count is "+count);
		/*for(int i = 0;i< s.length(); i++){
			char ch = s.charAt(i);
			int denomirator = s.length()-1;
			String newString = s;
			for (int j = 0; j < s.length(); j++) {
				//s.replaceAll(regex, replacement)
			}
		}*/
	}
}
