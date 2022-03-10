package com.shafana;

public class Method_Overloading {

	
	

	public void Shafana(String a) {
		System.out.println("i like biriyani with "+a);
		
		
	}
	
	
	public void Salma(int b) {
		System.out.println("she like chicken "+b);
		
	}
	public static void main(String[] args) {
		
		Method_Overloading z=new Method_Overloading();
		z.Shafana("chicken");
		z.Salma(65);
	}
	
}

