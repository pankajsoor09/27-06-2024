package com.javaBinaryOperators;

public class Example5
{

	public static void main(String[] args) 
	{

		int a = 2 , b = 3;
		
		int condition1 = (a & b);
		
		int condition2 = (a | b);
		
		System.out.println(condition1);
		
		System.out.println(condition2);
		/**
		 * 00000010 => 2
		 * 00000011 => 3
		 * ----------------
		 * 00000010 => 2 - & AND
		 * ----------------
		 * 
		 * 00000010 => 2
		 * 00000011 => 3
		 * ----------------
		 * 00000011 => 3 - | OR
		 * ----------------
		 */
	}

}
