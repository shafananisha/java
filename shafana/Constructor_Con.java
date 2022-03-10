package com.shafana;

public class Constructor_Con{
	
	public Constructor_Con() {
	     System.out.println("i like icecream");//it has no void type
	}
	
	
	
	public Constructor_Con(String d) {
		System.out.println("i hate" +d);
		
	}
	
	public Constructor_Con (int k) {
		System.out.println("i know " +k+ "% of cooking");
		
	}
	
	public static void main(String[] args) {
		Constructor_Con h=new Constructor_Con();
		Constructor_Con hh=new Constructor_Con(" curd");
		Constructor_Con hhh=new Constructor_Con(99);
		
	}
		
		
	}
	     
		
	
	
	
	
	


