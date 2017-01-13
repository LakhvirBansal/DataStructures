package com.java.src;

public class JumpSearch {

	public static void main(String[] args) {
		
		 int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		 int x = 144;

		 int index = jumpSearch(arr, x);

		 System.out.println("\nNumber " + x +" is at index " + index);

	}

	private static int jumpSearch(int[] arr, int x) {

		int arrLength = arr.length;
		int jumpValue = (int)Math.floor(Math.sqrt(arrLength));
		int prev = 0;
		int val = arr[jumpValue-1];
		
		while(val < x){
			prev = jumpValue;
			jumpValue += (int)Math.floor(Math.sqrt(arrLength));
			val = arr[jumpValue-1];
			if(prev >= arrLength){
				return -1;
			}
			
		}
		
		while(arr[prev] < x){
			prev++;
			if(prev == Math.min(jumpValue,arrLength)){
				return -1;
			}
		}
		
		if(arr[prev] == x){
			return prev;
		}
		/*while (arr[Math.min(jumpValue, arrLength) -1 ] < x){
			prev = jumpValue;
			jumpValue += (int)Math.floor(Math.sqrt(arrLength));
			if(prev >= arrLength){
				return -1;
			}
		}
		
		while(arr[prev] < x){
			prev++;
			if(prev == Math.min(jumpValue,arrLength)){
				return -1;
			}
		}
		if(arr[prev] == x){
			return prev;
		}*/
		return -1;
	}

}
