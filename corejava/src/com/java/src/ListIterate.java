package com.java.src;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIterate {

	public static void main(String[] args) {
		
		Boolean b = null;
		if(b == null){
			System.out.println("sxsdfasdf");
		}
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		gotMe:
		for (String string : list) {
			System.out.println(string);
			for (String string1 : list) {
			System.out.println(string1);
			break gotMe;
		}
		
		}
		
		/*for (String string : list) {
			System.out.println(string);
		}*/
	}
}
