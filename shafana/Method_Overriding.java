package com.shafana;

public class Method_Overriding extends Method_Overloading{
	
	
	@Override
	public void Shafana(String a) {
		System.out.println("i like chicken "+a);
		super.Shafana(a);
	}
	
	@Override
	public void Salma(int b) {
		System.out.println("she like the number "+b);
		super.Salma(b);
	}
	
	public static void main(String[] args) {
		Method_Overriding k=new Method_Overriding();
		k.Shafana("biriyani");
		k.Salma(17);
	}
	

}
