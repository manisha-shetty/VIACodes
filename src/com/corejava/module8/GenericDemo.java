package com.corejava.module8;


class Box<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}



public class GenericDemo {

	public static <E>void printElements( E[] arr){
		for(E obj: arr){
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {

		/*Vehicle vArr[]=new Vehicle[3];
		vArr[0]=new Vehicle("Audi",4, "black");
		vArr[1]=new Vehicle("BMW",4, "black");
		vArr[2]=new Vehicle("Maruti",4, "black");*/

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Printing String array");

		printElements(args);
		System.out.println("Printing Integer array");

		printElements(intArray);
		System.out.println("Printing Double array");
		printElements(doubleArray);

		System.out.println("Printing Character array");

		printElements(charArray);
		System.out.printf("Using a generic class");

		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();

		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));

		System.out.println("Integer Value :"+ integerBox.get());
		System.out.println("String Value :"+stringBox.get());

	}

}
