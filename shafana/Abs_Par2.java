package com.shafana;

public  class Abs_Par2 extends Abstraction_Partial{//1st abstract is must and again have to remove abstract
	
	
	
	@Override
	public void aisha() {
		System.out.println("goodgirl");
		
	}
	
	@Override
	public void syed() {
		System.out.println("goodboy");
		super.syed();
	}
	public static void main(String[] args) {
        Abs_Par2 h=new Abs_Par2();
		 h.aisha();
		 h.syed();
		
		
	}
	
	

}
