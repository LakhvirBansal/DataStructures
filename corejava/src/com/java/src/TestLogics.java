package com.java.src;

import java.util.Date;
import java.util.List;

public class TestLogics {
	public static void main(String[] args) {
    	long val2 = 1346524299999l;
        Date date1=new Date(val2);
        System.out.println(date1);
        java.text.SimpleDateFormat sdf = 
        	     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(date1);
        System.out.println(currentTime);
	}
}
