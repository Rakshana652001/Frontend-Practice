package com.chainsys.practice;

import java.util.Scanner;

public class TwoDAddition {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for row: ");
		int row = scan.nextInt();
		
		System.out.println("Enter number for col: ");
		int col = scan.nextInt();
		
		int arr[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		
		System.out.println("Enter array1 elements: ");
		for(int initial=0;initial<row;initial++)
		{
			for(int next=0;next<col;next++)
			{
				arr[initial][next] = scan.nextInt();
			}
		}
		
		System.out.println("Enter array2 elements: ");
		for(int initial=0;initial<row;initial++)
		{
			for(int next=0;next<col;next++)
			{
				arr2[initial][next] = scan.nextInt();
			}
		}
		
		int sum[][] = new int[row][col];
		for(int initial=0;initial<row;initial++)
		{
			for(int next=0;next<col;next++)
			{
				sum[initial][next] = arr[initial][next]+arr2[initial][next];
			}
		}
		
		System.out.println("After sum: ");
		for(int initial=0;initial<row;initial++)
		{
			for(int next=0;next<col;next++)
			{
				System.out.print(sum[initial][next]+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}