package com.javaBinaryOperators;

public class Example6 {

	public static void main(String[] args) {

		int a = 8 , b = 2;
		
		int condition1 = (a & b);
		
		int condition2 = (a | b);
		
		System.out.println(condition1);
		
		System.out.println(condition2);
		
		
		/**
		 * 00001000 => 8
		 * 00000010 => 2
		 * --------------
		 * 00000000 => 0 - & AND 
		 * --------------
		 * 
		 * 00001000 => 8
		 * 00000010 => 2
		 * ---------------
		 * 00001010 => 10 - | OR
		 */
	}

}
