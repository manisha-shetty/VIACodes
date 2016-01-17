package com.swabhav.threads;

public class OddThread implements Runnable{

	@Override
	public void run() {
		for(int number=0;number<40;number++){
			if(number%2!=0)
				System.out.println(number);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
