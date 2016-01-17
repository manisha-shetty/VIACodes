package com.swabhav.threads;

public class ThreadMain {

	public static void main(String[] s){

		Thread odd = new Thread(new EvenOddThread(false));
		Thread even = new Thread(new EvenOddThread(true));

		even.start();
		odd.start();

	}
}
