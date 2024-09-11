package com.chainsys.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrintThePair 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the target value: ");
		int num = scan.nextInt();
		
		System.out.println("Enter number for array: ");
		int number = scan.nextInt();
			
		for(int i=0;i<number;i++)
		{
			list.add(scan.nextInt());
		}
		
		System.out.println(list);
		
		ArrayList<Integer> getList = getList(list,number,num);
		
		for(int i : getList)
		{
			System.out.println("Index: "+i);
		}
		
		scan.close();
	}

	private static ArrayList<Integer> getList(final ArrayList<Integer> list, int size, int target) 
	{
		HashMap<Integer, Integer> mapping = new HashMap<Integer, Integer>();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(0);
		array.add(1);
		
		for(int i=0;i<size;i++)
		{
			if(mapping.containsKey(list.get(i)))
			{
				int index = mapping.get(list.get(i));
				array.set(0,index);
				array.set(1, i);
				break;
			}
			else
			{
				mapping.put(target-list.get(i), i);
			}
		}
		
		return array;
	}
} 