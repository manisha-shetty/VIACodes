package com.corejava.module9;

public class UnderAgeException extends Exception{

	int age;
	
	UnderAgeException(int a){
		age=a;
	}
	
	void disallow(){
		System.out.println("Sorry you are not allowed as your age is "+age+" which is below age limit");
	}
}
