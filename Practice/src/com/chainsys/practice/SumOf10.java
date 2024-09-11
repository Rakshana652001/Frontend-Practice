package com.chainsys.practice;

import java.util.Scanner;

public class SumOf10 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for array: ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		
		System.out.println(getSum(arr));
		
		scan.close();

	}

	private static boolean getSum(int[] arr) 
	{
		int search = 10;
		int fixed = 30;
		int temp=0;
		for(int num : arr)
		{
			if(num==search)
			{
				temp += search;
			}
			else
			{
				break;
			}
		}
		return temp==fixed;
	}
}