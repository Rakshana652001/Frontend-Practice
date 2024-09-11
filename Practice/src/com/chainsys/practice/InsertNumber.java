package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNumber {

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
		
		System.out.println("List: "+Arrays.toString(arr));
		int position;
		System.out.println("Enter a position to insert: ");
		position=scan.nextInt();
		
		System.out.println("Enter number to insert: ");
		int numToInsert = scan.nextInt();
		
		for(int last = num-1;last>position;last--) // 4
		{
			arr[last] = arr[last-1];//4->3
		}
		
		arr[position] = numToInsert;		
		System.out.println("After inserting: "+Arrays.toString(arr));
		scan.close();
	}
}