package com.java.src;

public class InterpolationSearch {

	public static void main(String[] args) {

		int arr[] = {10, 12, 13, 16, 31, 33, 35, 42, 47};
		
		 int n = arr.length;
		 
		    int x = 33; // Element to be searched
		    int index = interpolationSearch(arr, n, x);
		 
		    // If element was found
		    if (index != -1)
		        System.out.println("the search index is :"+index);
		    else
		    	System.out.println("Element not found.");
	}

	private static int interpolationSearch(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		int lo = 0, hi = (n - 1);
	    while (lo <= hi)
	    {
	        // Probing the position with keeping
	        // uniform distribution in mind.
	    	double midValue = ((double)(hi-lo) /(arr[hi]-arr[lo]));
	    	int lastVal = x-arr[lo];
	        int pos = (int) (lo + (midValue*lastVal));
	 
	        // Condition of target found
	        if (arr[pos] == x)
	            return pos;
	 
	        // If x is larger, x is in upper part
	        if (arr[pos] < x)
	            lo = pos + 1;
	 
	        // If x is smaller, x is in lower part
	        else
	            hi = pos - 1;
	    }
	    return -1;
	}

}
