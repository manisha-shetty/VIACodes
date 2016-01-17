package com.corejava.module11;

class RunnableThread implements Runnable {
	  // private Thread thread;
	   private String threadName;
	   
	   RunnableThread( String name){
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	     } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	     }
	     System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   /*public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (thread == null)
	      {
	         thread = new Thread (this, threadName);
	         thread.start ();
	      }
	   }*/

	}

	public class RunnableDemo {
	   public static void main(String args[]) {
	   
		   RunnableThread R1 = new RunnableThread( "Thread-1");
	      //R1.start();
	      Thread thread1=new Thread(R1);
	      thread1.start();
	      RunnableThread R2 = new RunnableThread( "Thread-2");
	     // R2.start();
	      Thread thread2=new Thread(R2);
	      thread2.start();


	   }   
	}