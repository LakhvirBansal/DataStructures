package com.java.src;

public class BubbleSort {
	static int num[] = {77,66,8,4,6,5,3,9,7,10,33,32,35,355};
	public static void main(String[] args) {
		int arrSize = num.length;
		int count=0,swapcount = 0;
		for( int out=arrSize-1; out>0; out--){
			for(int in=0; in<out; in++){
				if( num[in] > num[in+1] ){
					swap(in, in+1);
					swapcount++;
				}
				count++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println(count);
		System.out.println("the swap count is "+swapcount);
		}
	
	private static void swap(int one, int two){
		int temp = num[one];
		num[one] = num[two];
		num[two] = temp;
	}
	
}
