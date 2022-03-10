package com.shafana;

public class Keywords2 extends Keywords_con {
	
	
	int k=90;
	int a=77;
	
	public static int y=33;
	
	
	public void shafana() {
		
		int d=66;
		System.out.println(k);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(y);
		System.out.println(d);
	}

	
	public static void main(String[] args) {
		Keywords2 h=new Keywords2();
		h.shafana();
	}
}
