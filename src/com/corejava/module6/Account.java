package com.corejava.module6;
// 6. classes, objects, methods overloading, extending...
class Account {

	private long accountId;
	protected double balance;
	protected AccountHolder accountHolder;
	
	private static int count=0;
	
	Account(double bal, AccountHolder ah){
		count++;
		accountId=count;
		balance=bal;
		accountHolder=ah;
	}
	
	double deposit(double amt){
		balance+=amt;
		return balance;
	}
	
	//using varargs
	double deposit(double...amt){
		for(double a: amt){
			balance+=a;
		}
		
		return balance;
	}
	
	void displayBalance(){
		System.out.println("Balance is "+ balance);
	}
	
	double withdraw(){
		
		return balance;
	}

}
