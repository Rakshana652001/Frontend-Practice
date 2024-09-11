package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter nnumber for array: ");
		
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Array: "+Arrays.toString(arr));
				
		int total = num*((num+1)/2);
		
		int sum =0;
		for(int n:arr)
		{
			sum = sum+n;
		}
		
		System.out.println(sum-total);
		
		scan.close();

	}


}
