package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLargest {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Small: "+arr[0]);
		System.out.println("Largest: "+arr[num-1]);
		scan.close();
	}
}