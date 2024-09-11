package com.chainsys.practice;

import java.util.HashSet;
import java.util.Scanner;

public class PrintCommon {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for array1: ");
		int num1 = scan.nextInt();
		
		String arr[] = new String[num1];
		for(int i = 0; i<num1; i++)
		{
			arr[i] = scan.next();
		}
		
		System.out.println("Enter numbre for array2: ");
		int num2 = scan.nextInt();
		
		String arr2[] = new String[num2];
		
		for(int i =0;i<num2;i++)
		{
			arr2[i] = scan.next();
		}
		
		HashSet<String> list = new HashSet<String>();
		
		for(int i=0;i<num1;i++)
		{
			for(int next=0;next<num2;next++)
			{
				if(arr[i].equals(arr2[next]))
				{
					list.add(arr[next]);
				}
			}
		}
		
		System.out.println(list);		
		scan.close();
	}
}