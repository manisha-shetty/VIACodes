package com.corejava.module2;
//2. datatypes,vars,constants
public class Circle {

	private float area;
	private double volume;
	public final float PI=3.14159f;
	public static byte count=0;
	
	void calcArea(float r){
		area=PI*r*r;
		
	}


	void calcVolume(float r){
		volume= PI*r*r*r;
	
	}
	
	public static void main(String args[]){
		String s=args[0];
		System.out.println(s);
		Circle c=new Circle();
		Circle.count++;
		c.calcArea(10.0f);
		System.out.println("Area:"+c.area);
		c.calcVolume(3.44f);
		System.out.println("Volume:"+ c.volume);
		int a,v;
		a=(int)c.area;
		v=(int)c.volume;
		System.out.print("The area and volume after casting are: area="+ a + "\n Volume="+ v);
		
	}
}


