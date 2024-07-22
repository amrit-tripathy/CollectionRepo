package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> fruitList = new LinkedList<String>();
		
		fruitList.add("apple");
		fruitList.add("orange");
		fruitList.add("banana");
		fruitList.addFirst("mango");
		fruitList.addLast("watermelon");
//		fruitList.add(null);
		System.out.println(fruitList);//allows duplicates
		
		Iterator<String> itr = fruitList.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(fruitList);
		System.out.println(fruitList);
		
		System.out.println(fruitList.contains("mango"));
		LinkedList<String> myFruits =(LinkedList<String>) fruitList.clone();  //clone ===shallow copy
		System.out.println(myFruits.hashCode()); //same hashcode
		System.out.println(fruitList.hashCode());//same hashcode
		
		
		
		LinkedList<Employee>emplist = new LinkedList<Employee>();
		Employee e1 = new Employee("Amrit",123,40000,"hyderabad");
		Employee e2 = new Employee("abcd",234,25000,"hyderabad");
		Employee e3 = new Employee("defg",567,45000,"Delhi");
		Employee e4 = new Employee("defg",678,21000,"Delhi");
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		LinkedList<Employee> myEmps = (LinkedList<Employee>) emplist.clone(); //at first shallow copy but after modification both of them become their own entities
		System.out.println(emplist.hashCode());
		System.out.println(myEmps.hashCode());//same hashcode
		
		Employee e5 = new Employee("xyzw",675,21080,"Delhi");
		emplist.add(e5);
		System.out.println(emplist);
		
		
		
		
	}

}
