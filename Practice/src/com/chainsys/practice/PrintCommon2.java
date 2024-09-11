package com.chainsys.practice;

import java.util.Scanner;

public class PrintCommon2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for array1: ");
		int num1 = scan.nextInt();
		
		int array1[] = new int[num1];
		for(int i=0;i<num1;i++)
		{
			array1[i] = scan.nextInt();
		}
	
		System.out.println("Enter number for array2: ");
		int num2 = scan.nextInt();
		
		int array2[] = new int[num2];
		for(int i=0;i<num2;i++)
		{
			array2[i] = scan.nextInt();
		}
		
		System.out.println("Common numbers: ");
		for(int i=0;i<num1;i++)
		{
			for(int next=0;next<num2;next++)
			{
				if(array1[i] == array2[next])
				{
					System.out.print(array1[i]+" ");
				}
			}
		}
		
		scan.close();
	}
}