 package com.chainsys.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		System.out.println("Enter "+num+" digits: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int initial=0; initial<num;initial++)
		{
			list.add(scan.nextInt());
		}
		
		System.out.println("Enter the number to remove: ");
		int removeNum = scan.nextInt();
		
		list.remove(Integer.valueOf(removeNum));//remove number
		
		list.remove(removeNum);//remove index number
		System.out.println(list);
		
		scan.close();
	}

}
