package com.chainsys.practice;

import java.util.Scanner;

public class FindTheNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number for array: ");
		int num = scan.nextInt();
		int array[] = new int[num];

		System.out.println("Enter "+num+" digits: ");
		for(int initial=0;initial<num;initial++)
		{
			array[initial] = scan.nextInt();
		}

		System.out.println("Enter number to find: ");
		int findNum = scan.nextInt();

		boolean flag =  findNumber(array, findNum);
		if(!flag)
		{
			System.out.println("Array does not contains");
		}
		else
		{
			System.out.println("Array contains"); 
		}
		scan.close();
	}

	private static boolean findNumber(int[] array, int findNum) 
	{
		for(int num : array)
		{
			if(num==findNum)
			{
				return true;
			}
			else
			{
				return false;	
			}
		}
		return false;
	}
}