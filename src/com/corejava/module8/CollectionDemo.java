package com.corejava.module8;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class CollectionDemo {

	public static void main(String[] args) {
		System.out.println("\nWorking with ArrayList");
		List<Vehicle> arrList=new ArrayList<Vehicle>();
		arrList.add(new Vehicle("Enfield",2,"maroon"));
		arrList.add(new Vehicle("Pept",2,"red"));
		arrList.add(new Vehicle("Yamaha",2,"red"));
		arrList.add(new Vehicle("Harley",2,"red"));
		arrList.add(new Vehicle("Activa",2,"red"));
		arrList.add(new Vehicle("TVS",2,"maroon"));

		System.out.println("\nWorking with LinkedList");
		List<Vehicle> lnkList=new LinkedList<Vehicle>();
		lnkList.add(new Vehicle("Audi",4,"black"));
		lnkList.add(new Vehicle("Mercedes",4,"white"));
		lnkList.add(new Vehicle("Skoda",4,"white"));
		lnkList.add(new Vehicle("Maruti",4,"white"));
		lnkList.add(new Vehicle("BMW",4,"white"));
		lnkList.add(new Vehicle("Corolla",4,"black"));

		System.out.println("\nDifference between ArrayList and LinkedList remove operation:");
		System.out.println("Before removing all from arrList:"+Calendar.getInstance().getTimeInMillis());
		arrList.remove(1);
		System.out.println("After removing all from arrList:"+Calendar.getInstance().getTimeInMillis());
		lnkList.remove(1);
		System.out.println("After removing all from lnkList:"+Calendar.getInstance().getTimeInMillis());

		System.out.println("\nWorking with Stack");
		Stack<Vehicle> s=new Stack<Vehicle>();
		for(Vehicle v:arrList){
			s.push(v);
		}
		System.out.println(s.size()+" " +s.pop().name+" "+ s.size());

		System.out.println("\nWorking with Queue");
		Queue<Vehicle> q=new LinkedList<Vehicle>();
		for(Vehicle v:lnkList){
			q.add(v);
		}
		System.out.println(q.size()+" " +q.remove().name+" "+ q.size());
		
		System.out.println("\nWorking with HashMap");
		Map<String, Vehicle> vMap=new HashMap<String, Vehicle>();
		Iterator<Vehicle> iter= arrList.iterator();
		while(iter.hasNext()){
			Vehicle v=iter.next();
			vMap.put(v.name, v );
		}
		for(Map.Entry<String, Vehicle> entry:vMap.entrySet()){
			System.out.println(entry.getKey()+" "+ entry.getValue().color+" "+ entry.getValue().tyres);
		}
		
		System.out.println("\nWorking with HashSet");
		Set<Vehicle> vSet=new HashSet<>();
		iter= lnkList.iterator();
		while(iter.hasNext()){
			Vehicle v=iter.next();
			vSet.add(v);
		}
		for(Vehicle v:vSet){
			System.out.println(v.name);
		}
		
	}

}
