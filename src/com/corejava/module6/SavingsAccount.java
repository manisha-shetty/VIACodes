package com.corejava.module6;
// 6. classes, objects, methods overloading, extending...
class SavingsAccount extends Account{

	private static final int min=500;

	public SavingsAccount(double bal, AccountHolder ah){
		super(bal,ah);
	}
	
	boolean checkBalance(double amt){
		return balance-amt< min;
	}
	
	double withdraw(double amt){
		if(checkBalance(amt)){
			System.out.println("Sorry, not enough balance");
		} else{
			balance=balance-amt;
		}
		
		return balance;
	}

}
