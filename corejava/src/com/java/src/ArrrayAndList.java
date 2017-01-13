package com.java.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrrayAndList {

	public static void main(String[] args) {
		List<Integer> a =  new ArrayList<Integer>();
		 Set<Integer> set = new HashSet<Integer>();
		a.add(1);
		a.add(5);
		a.add(1);
		a.add(1);
		a.add(5);
        
        for (Integer temp : a){
        	if(set.contains(temp)){
        		System.out.println(temp);
        	}
        	else{
        		set.add(temp);
        	}
        	
        }
	}
}
