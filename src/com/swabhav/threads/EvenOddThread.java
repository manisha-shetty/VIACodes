package com.swabhav.threads;

class EvenOddThread implements Runnable {

	volatile boolean isEven;

	public EvenOddThread(boolean turn) {
		//this.type=type;
		this.isEven=turn;
	}

	@Override
	public void run() {
		for(int number=0;number<10;number++){
			if(number%2==0 && isEven){
				System.out.println("Even:"+number);
				isEven=false;

			}
			else if(number%2!=0 && !isEven){
				System.out.println("Odd:"+number);
				isEven=true;

			}

		}
	}
}

