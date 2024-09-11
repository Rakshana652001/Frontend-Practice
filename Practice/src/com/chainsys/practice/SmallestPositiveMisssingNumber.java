package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestPositiveMisssingNumber 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("Enter number for array: ");
		int number = getNumber();
		int arr[] = new int[number];
		for(int i=0;i<number;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		int missingDigit = getMissingDigit(arr, number);
		System.out.println("Missing digit is: "+missingDigit);
	}
	
	private static int getMissingDigit(int[] arr, int number)
	{
		int positiveDigits[] = Arrays.stream(arr).filter(x -> x>0).toArray();
		
		Arrays.sort(positiveDigits);
		
		int positive = 1;
		for(int num : positiveDigits)
		{
			if(num == positive)
			{
				positive++;
			}
		}
		return positive;
	}
	
	private static int getNumber()
	{
		int number = scan.nextInt();
		if(number<5)
		{
			System.out.println("Number for array must atleast have 5");
			return getNumber();
		}
		
		return number;
	}

}