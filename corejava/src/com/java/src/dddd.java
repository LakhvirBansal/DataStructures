package com.java.src;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class dddd {

	public static void main(String[] args) {
		/* Map<String, Double> customAttributes = new HashMap<String, Double>();
         customAttributes.put("minRevenue", 55000000000.0);
         System.out.printf("%.0f\n",customAttributes.get("minRevenue"));*/
         
         double number = 100550000.75;
         NumberFormat formatter = new DecimalFormat("#0.00");

         System.out.println(number);
         System.out.println(formatter.format(number));
       /*  System.out.println(customAttributes.get("minRevenue").toString());*/
	}
}
