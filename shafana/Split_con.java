package com.shafana;

public class Split_con {
	
	public static void main(String[] args) {
		 
		String k="my hobbie is that what i think to do";
		
		
		String[] s = k.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
				
	}

}
