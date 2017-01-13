package com.java.src;

public class BinarySearch {

	public static void main(String[] args) {
		
		BinarySearch ob = new BinarySearch();
		int[] arr ={10,20,30,40,50,60,70,80,90,100};
		int searchElement = 70;
		
		int arrayLength = arr.length;
		int result = ob.binarySearch(arr,0,arrayLength-1,searchElement);
		System.out.println("the search index is :"+result);
	}

	private int binarySearch(int[] arr, int startElement, int lastElement, int searchElement) {
	
		if(lastElement >= startElement){
			
			int mid = (startElement + lastElement) / 2;
			int number = arr[mid];
			if(searchElement == arr[mid]){
				return mid;
			} else{
				if(searchElement > arr[mid]){
					 return binarySearch(arr, mid +1, lastElement, searchElement);
				}
				     return binarySearch(arr, startElement, mid-1, searchElement);
			}
		}
		return -1;
	}
}
