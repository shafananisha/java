package com.shafana;

public class Interface3 implements Interface_con,Interface2{

	@Override
	public void concealer() {
	System.out.println("it hides darkcircles");
		
	}

	@Override
	public void eyeshadow() {
		System.out.println("it colours eyes");
		
	}

	@Override
	public void facepack() {
		System.out.println("it glows face");
		
	}

	@Override
	public void foundation() {
		System.out.println("it gives colour to face");
		
	}
	public static void main(String[] args) {
		Interface3 j=new Interface3();
		j.concealer();
		j.eyeshadow();
		j.facepack();
		j.foundation();
		
	}
	

}
