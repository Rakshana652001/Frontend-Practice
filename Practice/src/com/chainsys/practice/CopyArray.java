package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		int arr2[] = new int[num];
		for(int initial=0;initial<num;initial++)
		{
			arr[initial] = scan.nextInt();
		}
		System.out.println("List1: "+Arrays.toString(arr));
		for(int initial=0;initial<num;initial++)
		{
			arr2[initial] = arr[initial];
		}
		System.out.println("Copied array: "+Arrays.toString(arr2));
		
		scan.close();
	}
}