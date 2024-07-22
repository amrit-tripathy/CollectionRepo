package com.grayMatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item implements Comparable<Item>{
	private String itemName;
	private int nou;
	private int price;
	private String brand;
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return this.getBrand().compareTo(o.getBrand()); //this refers to current object 
	}

}
