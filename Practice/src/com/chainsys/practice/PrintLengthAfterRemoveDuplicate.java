package com.chainsys.practice;

import java.util.HashSet;
import java.util.Scanner;

public class PrintLengthAfterRemoveDuplicate {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number foe array: ");
		int num = scan.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i] =scan.nextInt();
		}
		
		System.out.println("Length after remove: "+ getLength(arr));
		scan.close();
	}

	private static int getLength(int[] arr)
	{
		HashSet<Integer> list = new HashSet<Integer>();
		for(int num : arr)
		{
			list.add(num);
		}
		
		int length = 0;
		
		for(int num : arr)
		{
			int count=1;
			
			for(int i=num-1;list.contains(i);--i)
			{
				list.remove(i);
				++count;
			}
			for(int i=num+1;list.contains(i);++i)
			{
				list.remove(i);
				++count;
			}
			length = Math.max(length, count);
		}
		return length;
	}
}