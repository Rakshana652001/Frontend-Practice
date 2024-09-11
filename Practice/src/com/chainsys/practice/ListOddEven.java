package com.chainsys.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOddEven {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		int arr[] = new int [num];
		
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			else
			{
				odd.add(arr[i]);
			}
		}
		
		System.out.println(even);
		System.out.println(odd);
		
		scan.close();
	}
}