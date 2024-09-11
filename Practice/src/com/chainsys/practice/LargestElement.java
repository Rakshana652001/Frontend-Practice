package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number for array: ");
		int number = scan.nextInt();
		int arr[] = new int[number];
		
		System.out.println("Enter the number for array: ");
		for(int i=0;i<number;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int max=0;
		
		for(int num:arr)
		{
			if(num>max)
			{
				max=num;
			}
		}
		
		System.out.println(max);
		
		scan.close();
	}
}