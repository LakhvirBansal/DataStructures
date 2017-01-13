package com.java.src;

public class SelectionSorting {
	
	public static void main(String[] args) {
		 int arr[] = {64,25,12,22,11};
	      
		 SelectionSorting ob = new SelectionSorting();
		 ob.sort(arr);
	     System.out.println("Sorted array");
	     ob.printArray(arr);
	}

	private void printArray(int[] arr) {
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

	private void sort(int[] arr) {
	
		int arrLength = arr.length;
		
		for (int i = 0; i < arrLength; i++) {
			
			for (int j =  i+1; j < arrLength; j++) {
				if(arr[j] < arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
