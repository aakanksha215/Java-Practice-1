package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args) 
	{
		int n;
		
		System.out.print("Enter any Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if (n%2==0) 
		{
			System.out.println("Even Number");
		} 
		else 
		{
			System.out.println("Odd Number");
		}
	}

}

// Output:
/*

Enter any Number : 20
Even Number





*/