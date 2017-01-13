package com.java.src;

public class BubbleSorting {

	public static void main(String[] args) {

		BubbleSorting ob = new BubbleSorting();
		int arr[] = {64, 25, 12, 22, 11};
	    ob.bubbleSort(arr);
	    System.out.println("Sorted array");
	    ob.printArray(arr);
	}

	private void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}

	private void bubbleSort(int[] arr) {
		int arrLength = arr.length;
		
		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength-i-1; j++) {
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
