package com.grayMatter;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ItemMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Item> list = new LinkedList<Item>();
		Item i1 = new Item("narzo",100,2000,"realme");
		Item i2 = new Item("fastT",100,3000,"realme");
		Item i3 = new Item("G-60",100,4000,"samsung");
		Item i4 = new Item("Galaxy",100,6000,"samsung");
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		System.out.println("default");
		for(Item i:list) {
			System.out.println(i);
		}
		
		System.out.println("Comparable");
		Collections.sort(list);
		for(Item i:list) {
			System.out.println(i);
		}
		
		Iterator<Item> iter = list.iterator();
		
		
		System.out.println("Comparator");
		list.sort(new ItemBrandComparator().thenComparing(new ItemNameComparator()));
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}

}
