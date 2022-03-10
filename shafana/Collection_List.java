package com.shafana;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_List {

	
	public static void main(String[] args) {
		
		
		List<Object> k=new ArrayList<>();
		
		k.add(99);
		k.add("shafana");
		k.add(9.8);
		k.add('S');
		
		System.out.println(k);
		
		Object g = k.get(0);
		System.out.println(g);
		
		
		boolean c = k.contains('A');
		System.out.println(c);
		
		
		int in = k.indexOf(9.8);
		System.out.println(in);
		
		
		int si = k.size();
		System.out.println(si);
		
		
		List<Object> l=new LinkedList<>();
		
		
		l.add(89);
		l.add("aisha");
		l.add(5.8);
		l.add('C');
		
		l.addAll(k);//should not give local variable
		System.out.println(l);
		
		l.remove(k);
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
