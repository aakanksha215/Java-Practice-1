package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Sum2Numbers
{
	public static void main(String[] args) 
	{
		int x, y, sum;
		
		System.out.println("Enter two Numbers");
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();	
		y = sc.nextInt();
		
		sum = x + y;
		
		System.out.println("Addition of two Number is " + sum);
	}

}

//Output
/* 
 
 Enter two Numbers
10
20
Addition of two Number is 30
 
  
 * 
 */