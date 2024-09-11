package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrintSecondMin {

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
		
		System.out.println("List: "+Arrays.toString(arr));
		
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int i=0;i<num;i++)
		{
			if(arr[i]==min)
			{
				secondMin = min;
			}
			else if(arr[i]<min)
			{
				secondMin = min;
				min = arr[i];
			}
			else if(arr[i]<secondMin)
			{
				secondMin = arr[i];
			}
		}
		System.out.println("2nd min: "+secondMin);
		scan.close();
	}
}