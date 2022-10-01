package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Sum_Odd_or_Even
{
	public static void main(String[] args) 
	{
		char ch;
		
		System.out.print("Enter Character : ");
		
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		System.out.println("You Enter this Character : " + ch);
		
	}

}


/* Output:
 
 Enter Character : M
You Enter this Character : M
 

*/