package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Sum_Natural_Numbers
{
	public static void main(String[] args) 
	{
		int n, sum = 0;
		
		System.out.print("Enter Number :");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();		
		
		for (int i = 1; i <= n; i++) 
		{
			sum = sum + i;
			
		}
		System.out.print("Addition "+ sum);
	}

}


/* Output:
 
 
 Enter Number : 10
Addition 55
 
 
 
 */