package com.java.src;

import java.util.ArrayList;
import java.util.List;

public class ClearList {
	
	public static void main(String[] args) {
		List<String> st = new ArrayList<String>();
		st.add("dfsdfsd");
		st.add("dfsdfsd");
		System.out.println(st);
		st.clear();
		System.out.println(st);
		st.clear();
		System.out.println(st);
	}
}
