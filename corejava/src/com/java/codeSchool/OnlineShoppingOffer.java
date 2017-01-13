package com.java.codeSchool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OnlineShoppingOffer {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int numbers = s.nextInt();
        String[] strArr = new String[numbers*2];
        for (int i = 0; i < numbers*2; i++) {
        	Scanner sc = new Scanner(System.in);
    		String next = sc.nextLine();
    		strArr[i] = next;
        }
        for (int i = 0; i < strArr.length; i++) {
        	Map<Character,Integer> categoryPriceMap = new HashMap<Character,Integer>();
        	Map<Character,Integer> characterCountMap = new HashMap<Character,Integer>();
        	String categories = strArr[i];
        	i = i+1;
        	String prize = strArr[i];
        	String[] catgoryPrices = prize.split(" ");
        	for (int j = 65; j < 91; j++) {
        		categoryPriceMap.put((char)j, Integer.parseInt(catgoryPrices[j-65]));
			}
        	for(int j = 0; j < categories.length() ;j++){
        		char ch = categories.charAt(j);
        		if(characterCountMap.containsKey(ch)){
        			int alreadyValue = characterCountMap.get(ch);
        			characterCountMap.put(ch, (alreadyValue +1) );
        		}
        		else{
        			characterCountMap.put(ch, 1);
        		}
        	}
        	
        	System.out.println("categoryPriceMap :"+categoryPriceMap);
        	System.out.println("characterCountMap :"+characterCountMap);
        	
        	Set<Character> keySet = characterCountMap.keySet();
        	Iterator itr = keySet.iterator();
        	double totalPrice = 0;
        	while(itr.hasNext()){
        		Character keyValue = (Character) itr.next();
        		int takingValue = characterCountMap.get(keyValue);
        		int totalQuantity = 0;
        		if(takingValue > 2){
        			int quotient = takingValue/3;
        			totalQuantity = 2 * quotient;
        			int remainder = takingValue%3;
        			totalQuantity = totalQuantity + remainder;
        		}
        		else{
        			totalQuantity = takingValue;
        		}
        		int parCategoryPrice = categoryPriceMap.get(keyValue);
        		totalPrice = totalPrice + (totalQuantity*parCategoryPrice);
        	}
        	
        	System.out.println(totalPrice);
		}
	}
}
