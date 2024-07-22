package com.grayMatter;

import java.util.Collections;
import java.util.Stack;

public class DemoOnStack {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(66);
		st.push(90);
		st.push(98);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.capacity()); //initial capacity ==10
		st.trimToSize();
		System.out.println(st.capacity());  //after trimming capacity =3
		st.add(77);
		System.out.println(st.capacity());  //when capacity gets exhausted it doubles its capacity
		
		
		
		
		
	}

}
