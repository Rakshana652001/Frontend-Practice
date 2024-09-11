package com.chainsys.practice;

import java.util.OptionalInt;
import java.util.Scanner;

public class FindIndex 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		System.out.println("Enter "+num+" digits: ");
		int array[] = new int [num];
		for(int initial=0;initial<num;initial++)
		{
			array[initial] = scan.nextInt();
		}
		
		System.out.println("Enter a number to find Index: ");
		int index = scan.nextInt();
		
		findIndex(array,index).ifPresentOrElse(yes -> System.out.println("Position: "+yes), () -> System.out.println("Does not contain"));
				
		scan.close();
	}

	private static OptionalInt findIndex(int[] array, int index)
	{
		if(array==null || array.length ==0)
		{
			return OptionalInt.empty();
		}
		else
		{
			for(int initial=0;initial<array.length;initial++)
			{
				if(array[initial]==index)
				{
					return OptionalInt.of(initial);
				}
			}
		}
		return OptionalInt.empty();
	}
}