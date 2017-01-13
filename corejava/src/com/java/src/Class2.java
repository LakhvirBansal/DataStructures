package com.java.src;

//filename: Test2.java
class Test1 {   
 Test1(int x) {
     System.out.println("Constructor called " + x);
 }
}

//This class contains an instance of Test1 
public class Class2 {    
 Test1 t1 = new Test1(10);   

 Class2(int i) { t1 = new Test1(i); } 

 public static void main(String[] args) {    
	 Class2 t2 = new Class2(5);
 }
}
