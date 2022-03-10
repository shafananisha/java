package com.shafana;

public class Variables2 {
	
	int I=12;
	public static int O=55;
	
	private void Shafana() {
		int R=99;
		System.out.println(I);
		System.out.println(O);
		System.out.println(R);
		System.out.println(Static_Variables.C);//without extends we can call the static variables
		
		
	}
	public static void main(String[] args) {
		Variables2 n=new Variables2();
		n.Shafana();
		
		
		
	}
		
	

}
