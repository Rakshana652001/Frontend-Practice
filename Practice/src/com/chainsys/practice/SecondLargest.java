package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number for array: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int index = num-1;
		for(int i=0;i<num;i++)
		{
			if(arr[num-1] == arr[index])
			{
				index--;
			}
		}
		
		System.out.println(arr[index]);
		scan.close();
	}
}