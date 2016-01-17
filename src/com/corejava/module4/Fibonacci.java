package com.corejava.module4;
//4. control structures
import java.util.Scanner;


public class Fibonacci {

	
	static void fibonacciWithFor(){
		int first=0;
		int second=1;
		System.out.print("Fibonacci Series using for loop is:"+first+ " "+second);
		for(int counter=1; counter<=8;counter++){
			int third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
		}
	}
	
	static void fibonacciWithWhile(){
		int first=0;
		int second=1;
		System.out.print("Fibonacci Series using while loop is:"+first+ " "+second);
		int counter=1;
		while(counter<=8){
			int third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
			counter++;
		}
	}
	
	static void fibonacciWithDoWhile(){
		int first=0;
		int second=1;
		System.out.print("Fibonacci Series using do while loop is:"+first+ " "+second);
		int counter=1;
		do{
			int third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
			counter++;
		}while(counter<=8);
	}

public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Lets print fibonacci numbers. Make a choice: \n1.for \n2.while \n3.do while ");
		String ch=in.next();
		System.out.println("How many nos you want to print");
		int limit=in.nextInt();
		if(limit>10){
			System.out.println("We currently would print below 10 only");
		} else if(limit<=10){
			switch(ch){
			case "1":fibonacciWithFor(); break;
			case "2":fibonacciWithWhile();break;
			case "3":fibonacciWithDoWhile();break;
			default:System.out.println("Not a valid option.3");
			}
		}
		in.close();
}

}
