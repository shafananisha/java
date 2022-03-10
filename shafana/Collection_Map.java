package com.shafana;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection_Map {
	
	public static void main(String[] args) {
		
		
		Map<Integer, Object>  k=new HashMap<>();
		
		
		k.put(0, "shafana");
		k.put(1, 'L');
		k.put(2, 3.5);
		k.put(3, "Nisha");
		k.put(4, "400");
		
		System.out.println(k);
		
		Collection<Object> values = k.values();
		System.out.println(values);
		
		Set<Integer> keySet = k.keySet();
		System.out.println(keySet);
		
		boolean containsValue = k.containsValue('S');
		System.out.println(containsValue);
		
		boolean containsKey = k.containsKey(6);
		System.out.println(containsKey);
		
		
		Map<Integer, Object>  j=new LinkedHashMap<>();
		
		j.put(0, "aisha");
		j.put(1, 'D');
		j.put(2, 6670);
		j.put(3, 8.9);
		j.put(4, "kite");
		 
		
		System.out.println(j);
		
		
		 Object object = j.get(3);
		 System.out.println(object);
		 
		 
		 Collection<Object> values2 = j.values();
		 System.out.println(values2);
		 
		 Set<Integer> keySet2 = j.keySet();
		 System.out.println(keySet2);
		 
		 boolean containsKey2 = j.containsKey(6);
		 System.out.println(containsKey2);
		 
		 
		 boolean containsValue2 = j.containsValue(9.8);
		 System.out.println(containsValue2);
		 
		 
		 j.putAll(k);
		 System.out.println(j);
		
		
		j.replace(3, 28);
		System.out.println(j);
		
		
		Object remove = j.remove(1);
		System.out.println(remove);
		
		
		
		j.clear();
		System.out.println(j);
		
		
		Map<Object, Integer> l=new TreeMap<>();
		
		l.put('A', 9);
		l.put('B', 6);
		l.put('C', 7);
		l.put('D', 8);

		System.out.println(l);
		
		
		Collection<Integer> values3 = l.values();
		System.out.println(values3);
		
	     Set<Object> keySet3 = l.keySet();
	     System.out.println(keySet3);
	     
	     
	      boolean containsKey3 = l.containsKey('S');
			System.out.println(containsKey3);
			
			boolean containsValue3 = l.containsValue(7);
			System.out.println(containsValue3);
			
			
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
