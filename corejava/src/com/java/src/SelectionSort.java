package com.java.src;

public class SelectionSort {
	static int num[] = {77,66,8,4,6,5,3,9,7,10};
	public static void main(String[] args) {
		int min;
		int count = 0;
		int swapCount = 0;
		for (int i = 0; i < num.length; i++) {
			min = i;
			for (int j = i+1; j < num.length; j++) {
				if(num[j] < num[min]){
					swap(j,min);
					min = j;
					swapCount++;// in selection sort swap count is less than swap count in bubble sort.
				}
				count++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println(count);
		System.out.println("the swap count is "+swapCount);
	}
	private static void swap(int j, int min) {
		int temp = num[min];
		num[min] = num[j];
		num[j] = temp;
	}
}
