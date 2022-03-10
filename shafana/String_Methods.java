package com.shafana;

public class String_Methods {
	
	public static void main(String[] args) {
		
		String a="i love to eat popcorn in theatres";
		
		
		int length = a.length();
		System.out.println(length);
		
		boolean equals = a.equals("i hate ate cornpop ni thet");
		System.out.println(equals);
		
		boolean eq = a.equalsIgnoreCase("i hate ate cornpop ni thet");
		System.out.println(eq);
		
		
		
		boolean contains = a.contains("eat");
		System.out.println(contains);
		
		
		char charAt = a.charAt(4);
		System.out.println(charAt);
		
		
		int indexOf = a.indexOf("e");
		System.out.println(indexOf);
		
		
		String u = a.toUpperCase();
		System.out.println(u);
		
		
		String l = a.toLowerCase();
		System.out.println(l);
		
		String r = a.replace("e", "o");
		System.out.println(r);
		
		String sb = a.substring(6);
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
