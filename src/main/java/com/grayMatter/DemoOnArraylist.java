package com.grayMatter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class DemoOnArraylist {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ArrayList<Employee>emplist = new ArrayList<Employee>();
		Employee e1 = new Employee("Amrit",123,40000,"hyderabad");
		Employee e2 = new Employee("abcd",234,25000,"hyderabad");
		Employee e3 = new Employee("defg",567,45000,"Delhi");
		Employee e4 = new Employee("defg",678,21000,"Delhi");
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		System.out.println(emplist);
		
		System.out.println("enhanced for loop");
		
		for(Employee emp:emplist) {
			System.out.println(emp);
		}
		
		System.out.println("using iterator");
		
		Iterator<Employee> itr = emplist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("sort operation");
		//comparable takes single object and comparator takes two objects
		
		//Collections.sort(emplist);  //throws error as sort method works only on primitive data types and not on user defined data types
		emplist.sort(new CityComparator().thenComparing(new NameComparator())
				.thenComparing(new SalaryComparator()));  //for each comparison create a new class then use that comparator by creating a new object
		//thenComparing is used to add multiple comparators 
		
		
		for(Employee emp:emplist) {
			System.out.println(emp);
		}
		
		Employee employee = new Employee();
		Employee emp1 =(Employee) employee.clone();
		System.out.println(emp1.hashCode()+" "+employee.hashCode());
			
		
	}

}
