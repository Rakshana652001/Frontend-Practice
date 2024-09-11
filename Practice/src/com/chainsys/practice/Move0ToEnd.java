package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Move0ToEnd 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number for array: ");
		int number = scan.nextInt();
		
		System.out.println("Enter "+number+" numbers for array: ");
		int arr[] = new int[number];
		for(int i=0;i<number;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Array initial"+Arrays.toString(arr));
		
		int zeroPosition=0;
		for(int  initial=0; initial<number; )
		{
			if(arr[initial] == 0)
			{
				initial++;
			}
			else
			{
				int temp = arr[zeroPosition];
				arr[zeroPosition] = arr[initial];
				arr[initial] = temp;
				zeroPosition++;
				initial++;
			}
		}
		
		while(zeroPosition<number)
		{
			arr[zeroPosition++] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
		
		scan.close();
	}
}