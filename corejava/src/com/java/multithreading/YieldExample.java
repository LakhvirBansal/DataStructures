package com.java.multithreading;

public class YieldExample {

	 public static void main(String[] args)
	   {
	      Thread producer = new Producer();
	      Thread consumer = new Consumer();
	       
	      producer.setPriority(Thread.MAX_PRIORITY); //Min Priority
	      System.out.println("producer priorty :"+producer.getPriority());
	      
	      consumer.setPriority(Thread.MIN_PRIORITY); //Max Priority
	      System.out.println("consumer priorty :"+consumer.getPriority()); 
	      
	      producer.start();
	      consumer.start();
	   }
}

class Producer extends Thread
{
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         System.out.println("I am Producer : Produced Item " + i);
         Thread.yield();
      }
   }
}
 
class Consumer extends Thread
{
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         System.out.println("I am Consumer : Consumed Item " + i);
         Thread.yield();
      }
   }
}
