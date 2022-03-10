package com.shafana;

public class Heap_Memory {

	  public static void main(String[] args) {
		
		  
		  //immutable
		  String a="Shafana";
		  String b="aisha";
		  String c="nisha";
		  String d="Shafana";
		  
		  System.out.println(System.identityHashCode(a));
		  System.out.println(System.identityHashCode(b));
		  System.out.println(System.identityHashCode(c));
		  System.out.println(System.identityHashCode(d));
		  
		  
          String concat = a.concat(d);
          System.out.println(concat);
          System.out.println(System.identityHashCode(concat));
          
//mutable
          StringBuffer s1=new StringBuffer("Shafana");
          StringBuffer s2=new StringBuffer("aisha");
          StringBuffer s3=new StringBuffer("nisha");
          StringBuffer s4=new StringBuffer("Shafana");
          
          
          System.out.println(System.identityHashCode(s1));
          System.out.println(System.identityHashCode(s2));
          System.out.println(System.identityHashCode(s3));
          System.out.println(System.identityHashCode(s4));
          
          StringBuffer append = s1.append(s4);
          System.out.println(append);
          System.out.println(System.identityHashCode(append));
          
          StringBuffer reverse = s1.reverse();
          System.out.println(reverse);
          System.out.println(System.identityHashCode(reverse));
          
          
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
	
	
	
	
	
	
	
	
	
}
