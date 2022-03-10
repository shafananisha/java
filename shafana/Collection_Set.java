package com.shafana;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {
	
	public static void main(String[] args) {
		
		
		
		Set<Object> i=new HashSet<>();//output will be in ziczac order
		
		i.add("aisha");
		i.add(78);
		i.add('F');
		i.add(2.8);
		
		
		System.out.println(i);

		Class<? extends Set> class1 = i.getClass();
		System.out.println(class1);
		
		
		boolean con = i.contains(78);
		System.out.println(con);
		
		int si = i.size();
		System.out.println(si);
		
		
		
		Set<Object> j=new LinkedHashSet<>();//in same order
		
		
		j.add("nisha");
		j.add(84);
		j.add('G');
		j.add(4.5);
		
		
		System.out.println(j);
		
		int siz = j.size();
		System.out.println(siz);
		
		
		boolean cont = j.contains(77);
		System.out.println(cont);
		
		
		
		Set<Object> n=new TreeSet<>();
		

		n.add("gang");
		n.add("send");//it will accept only similar variables
		n.add("give");//run in ascending order and (in numbers)small to big
		n.add("late");
		
		
		System.out.println(n);
		
		int size = n.size();
		System.out.println(size);
		
		boolean contains = n.contains("kite");
		System.out.println(contains);
		
		
		int size2 = j.size();
		System.out.println(size2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
