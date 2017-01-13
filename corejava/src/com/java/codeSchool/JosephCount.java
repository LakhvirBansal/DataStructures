package com.java.codeSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephCount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int numbers = s.nextInt();
       
        for (int i = 0; i < numbers; i++) {
        	Scanner sc = new Scanner(System.in);
        	String value = sc.nextLine();
        	String[] wholeString = value.split(" ");
			int noOfSoldiers = Integer.parseInt(wholeString[0]);
			int randonNo = Integer.parseInt(wholeString[1]);
			int count = 0;
			List<Integer> list = new ArrayList<Integer>(noOfSoldiers);
			for (int j=1; j<= noOfSoldiers ;j++) {
				list.add(j);
			}
			/*for(int j = 1;j<= noOfSoldiers; j++){
				count = count + 1;
				if(count == randonNo){
					noOfSoldiers--;
					j--;
				}
			}*/
			
			while(list.size() > 1){
				int listSize = list.size();
				count = count + 1;
				
				
				if(randonNo%count == 0){
					if(listSize >= count){
						list.remove(count);
					} else{
						
					}
					int index = count%listSize;
					list.remove(count-1);
				}
			}

			System.out.println("the element is "+list.get(0));
		}
	}
}
