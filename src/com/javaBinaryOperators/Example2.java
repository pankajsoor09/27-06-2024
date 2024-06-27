package com.javaBinaryOperators;

public class Example2
{

	public static void main(String[] args) 
	{
       int a = 200, b = 300 , c = 250, d = 150 ;
       
      boolean condition1 = (a >= d);// true
      boolean condition2 = (b >= c);// true
      boolean condition3 = (c >= a);// true
      boolean condition4 = (b == d);// false
      boolean condition5 = (c == a);// false
      boolean condition6 = (b != a);// true
      
      System.out.println(condition4 && condition5); //&& - AND
      
      System.out.println(condition2 || condition3); //|| - OR
      
      System.out.println(!condition1); // ! - NOT
      
      System.out.println(condition6);
      
       
	}

}
