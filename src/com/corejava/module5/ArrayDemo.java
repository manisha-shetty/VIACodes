package com.corejava.module5;
import java.util.Arrays;


public class ArrayDemo {
	public static void main(String[] args) {
		int b[] = {2,3,-1,4,6,5};
		
		//min max
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
 
		for(int i : b ) {
			if (i>=max) { 
				max = i;
			} else if (i< min)
				min = i;
		}
		System.out.println("Max is:"+max+"\n Min is:"+ min);

		//reverse
		int N = b.length;
		int temp;
 
		for (int i = 0; i < N/2; i++) {
			temp = b[N-i-1];
			b[N-i-1] = b[i];
			b[i] = temp;
		}
 
		System.out.print(Arrays.toString(b));
		
	}

}


