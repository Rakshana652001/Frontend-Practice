package com.chainsys.practice;

import java.util.Scanner;

public class RemoveDuplicates {

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
		
		System.out.println("Count after remove: "+getCount(arr));
		scan.close();
	}

	private static int getCount(int[] arr)
	{
		int index = 1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] != arr[index-1])
			{
				arr[index++] = arr[i];
			}
		}
		return index;
	}
}