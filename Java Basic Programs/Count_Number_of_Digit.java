package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Count_Number_of_Digit 
{
	public static void main(String[] args) 
	{
		int n, count=0;
		
		System.out.print("Enter any Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		while(n>0)
		{
			n = n/10;
			
			count++;
		}
		
		System.out.print("Number of Digits : " + count);
	}

}

// Output:

/*

Enter any Number : 999
Number of Digits : 3


*/