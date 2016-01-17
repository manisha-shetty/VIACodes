//7. interface and abstract class
package com.corejava.module7;


interface Downloadable{
	final static float Pi=3.14f;
	
	void openStore(); // no body allowed, abstract method
}

abstract class Phone {
	
	String color;
	float simcards;
	
  void call(){
	  
	  System.out.println("Calling...");
  }
	
} 
class IPhone extends Phone implements Downloadable{
	
	public void openStore(){
		System.out.println("Opening iphone app store");
	}
	
	
}
class AndroidPhone extends Phone implements Downloadable{
	public void openStore(){
		System.out.println("Opening google play store");
	}
}

class WindowsPhone extends Phone implements Downloadable{
	public void openStore(){
		System.out.println("Opening Lumia store");
	}
}

public class InterfaceAbstractDemo {

	public static void main(String[] args) {
			IPhone i = new IPhone(); 
			i.simcards=1;
			i.color="white";
			i.call();
			i.openStore();
			
			AndroidPhone a = new AndroidPhone(); 
			a.simcards=2;
			a.color="black";
			a.call();
			a.openStore();

			WindowsPhone w = new WindowsPhone(); 
			w.simcards=2;
			w.color="green";
			w.call();
			w.openStore();

			}
	

}
