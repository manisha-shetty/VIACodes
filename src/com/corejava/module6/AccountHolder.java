package com.corejava.module6;
// 6. classes, objects, methods overloading, extending...	
class AccountHolder {

String name;
int age;

AccountHolder(String n, int a){
	name=n;
	age=a;	
}

public static void main(String a[]){
	AccountHolder ah=new AccountHolder("Manisha",25);
	SavingsAccount sa=new SavingsAccount(2000, ah);
	sa.deposit(100);
	sa.deposit(100,200);
	sa.displayBalance();
	sa.withdraw(100);
	sa.displayBalance();
	try {
		ah.finalize();
	} catch (Throwable e) {
		e.printStackTrace();
	}
}
}
