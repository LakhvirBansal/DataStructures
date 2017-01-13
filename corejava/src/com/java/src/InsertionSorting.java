package com.java.src;

public class InsertionSorting {

	public static void main(String[] args) {

		int arr[] = {12, 11, 13, 5, 6,3,2,1,44,22};
		 
		InsertionSorting ob = new InsertionSorting();        
        ob.sort(arr);
         
        printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i +" ");
		}
		
	}

	private void sort(int[] arr) {
	
		int arrLength = arr.length;
		
		for (int i = 1; i < arrLength; i++) {
			int element = arr[i];
		/*	int j = i-1;
			
			while(j >= 0 && arr[j] > element){
				
	                arr[j+1] = arr[j];
	                j = j-1;
	       
	           
			}
			 arr[j + 1] = element;*/
			for (int j = 0; j < i; j++) {
				if(arr[j] > element){
					for (int k = i; k > j; k--) {
						arr[k] = arr[k-1];
						i--;
					}
					
					arr[j] = element;
				
				}
			}
			
		}
	}

}
