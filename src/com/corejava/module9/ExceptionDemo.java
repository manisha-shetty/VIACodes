/* do it in notepad.
 * 
 * start with arithmetic with no catch
 * try catching and nest ArrayException
 * include Numberformat and throw
 * now head on to checked ones like IOException, try throw without catch
 * now catch and shift numberformat to last
 * 
 * 
 * */



package com.corejava.module9;

import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		try{
		int a=10/Integer.parseInt(args[0]);
		}catch(ArithmeticException e){
			System.out.println(" caught Arithmetic exception");
			try{
				int arr[]=new int[5];
			System.out.println(arr[6]);
			} catch(ArrayIndexOutOfBoundsException f){
				System.out.println(" caught Array Exception\n\n");

			}
			
			//try catch compulsary to avoid compile time error
			try{
				throw new IOException();
			} catch(IOException i){
				System.out.println(" caught IO Exception\n\n");

			}				
			throw new NumberFormatException();

		}
		

	}

}
