package com.chainsys.practice;

import java.util.Scanner;

public class PrintTheGrid
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		int arr[][] = new int [num][num];
		
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				String a = "- ";
				System.out.printf(a, arr[row][col]);
			}
			System.out.println();
		}
		scan.close();
	}
}