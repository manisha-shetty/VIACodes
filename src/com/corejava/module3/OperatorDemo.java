package com.corejava.module3;
//3. tokens
public class OperatorDemo {
	public static void main(String args[]){
 		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		//demo of various operators
		byte byt = 64, tmp;
		int i;
 		i =  byt<< 2;
		tmp = (byte) (byt << 2);
 		System.out.println("Original value of byt: " + byt);
		System.out.println("i and tmp: " + i + " " + tmp);
		
		char hex[] = {
				'0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
			};
			tmp = (byte) 0xf1;
	 
			System.out.println("tmp = 0x" + hex[(tmp >> 4) & 0x0f] + hex[tmp & 0x0f]);
		
		//expressions using operators
		System.out.println("The ans to arithmetic expression a+b-a/b%a is ="+ (a+b-a/b%c*a));
		System.out.println("The ans to relational expression a>b "+ (a>b) + "and c!=b "+(c!=b));
		System.out.println("The ans to bitwise operator's expression ~a&b|b^c"+ (~a&b|b^c));
		System.out.println("The ans to shift operator's expression a>>>2"+ (a>>>2));		
		System.out.println("The ans to logical expression !(a<c && b<c)"+ !(a<c && b<c));
		System.out.println("The ans to ternary expression a>b?a:b"+ (a>b?a:b));
		System.out.println("The ans to expression a%=b"+ (a%=b));


		
		
		
	}
}
