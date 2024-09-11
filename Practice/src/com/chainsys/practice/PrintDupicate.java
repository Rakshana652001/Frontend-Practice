package com.chainsys.practice;

import java.util.Scanner;

public class PrintDupicate 
{
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
		
		//1234
		for(int i=0;i<num-1;i++)//1->3
		{
			for(int next=i+1;next<num;next++)//2->4
			{
				if(arr[i]==arr[next] && i!=next)
				{
					System.out.println(arr[next]);
				}
			}
		}
		scan.close();
	}
}