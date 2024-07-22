package com.grayMatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor     //benifits of lombak no need to update constructor or getter and setters 
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable,Cloneable {
	
	private String empName;
	private int empId;
	private double empSal;
	private String city;
	@Override
	public int compareTo(Object o) {
		
		Employee e = new Employee();
		e = (Employee)o; //here we need to convert Object to Employee object
		
		//while typecasting we need to create an appropriate storage container
		
//		return this.getEmpId()-e.getEmpId();  //sorting on empId;
//		return this.getEmpName().compareTo(e.getEmpName()); //sorting on name
		return (int) (this.getEmpSal()-e.getEmpSal());  //typecasting to int  ===sorting on salary
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
