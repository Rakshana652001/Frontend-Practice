package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		for(int initial=0;initial<num;initial++)
		{
			arr[initial] = scan.nextInt();
		}
		
		System.out.println("Before rever: "+Arrays.toString(arr));
		
		for(int initial=0;initial<num/2;initial++)
		{
			int temp = arr[initial];
			arr[initial] = arr[num-initial-1];
			arr[num-initial-1] = temp;
		}
		System.out.println("After reverse: "+Arrays.toString(arr));
		scan.close();
	}
}