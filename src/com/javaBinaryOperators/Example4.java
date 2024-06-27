package com.javaBinaryOperators;

public class Example4
{

	public static void main(String[] args)
	{
/**
 * write a java program to verify the given number is divisible by 4 or 5
 * 
 * Note : the number is 450
 */
		
		int num = 450; 
		
		boolean condition = (num%4 == 0 || num%5 ==0);
		
		System.out.println(condition);
	}

}
