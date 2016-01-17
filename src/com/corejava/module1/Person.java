package com.corejava.module1;
//1. Intro to java

public class Person {

	final public int hands,legs;
	private int energylevel;
	static private int count;
	
	Person(){
		hands=2;
		legs=2;
		energylevel=50;
		count++;
	}
	
	int work(){
		System.out.println("Working and returning energy");
		return --energylevel;
		
	}
	
	
	int sleep(){
		System.out.println("Sleeping for 10 minutes");
		return ++energylevel;
	}

	int sleep(int hours){
		System.out.println("Sleeping for " + hours + "hours");
		return ++energylevel;
	}
	
	int getEnergyLevel(){
		return energylevel;	
	}
	
	public static void main(String args[]){
		Person sam=new Person();
		System.out.println("Person number-"+Person.count);
		System.out.println("New energy level"+sam.work());
		sam.sleep(20);
		System.out.println("New energy level"+ sam.getEnergyLevel());
		System.out.println("New energy level"+sam.sleep());

	}
}
