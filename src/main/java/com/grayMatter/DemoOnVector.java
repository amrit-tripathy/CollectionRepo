package com.grayMatter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>();//resizable array====legacy class
		//initial capacity =10,
		//if vector capacity gets exhausted then it doubles the capacity every time
		System.out.println(vector.capacity());
		for(int i=0;i<=10;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());//capacity = 20
		
		Enumeration<Integer>myNum=vector.elements();//similar to iterator
		while(myNum.hasMoreElements()) {
			
			System.out.println(myNum.nextElement());
		}
		
		Iterator<Integer>itr = vector.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			if(i==6) {
				itr.remove();
			}
		}
		System.out.println(vector);
		
		
	}

}
