package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumericAndStringarray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num1 = scan.nextInt();
		
		int array1[] = new int[num1];
		System.out.println("Enter "+num1+" digits: ");
		for(int initial=0;initial<num1;initial++)
		{
			array1[initial] = scan.nextInt();
		}
		
		System.out.println("Array 1"+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted Array: "+ Arrays.toString(array1));

		System.out.println("Enter a number: ");
		int num2 = scan.nextInt();
		
		String array2[] = new String[num2];
		System.out.println("Enter "+num2+" strings: ");
		for(int initial=0;initial<num2;initial++)
		{
			array2[initial]=scan.next();
		}
		
		System.out.println("Array2"+Arrays.toString(array2));
		
		Arrays.sort(array2);
		
		System.out.println("Sorted: "+Arrays.toString(array2));
		
		scan.close();
	}
}