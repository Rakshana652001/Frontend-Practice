package com.chainsys.practice;

import java.util.Scanner;

public class SummArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		int array[] = new int [num];
		
		System.out.println("Enter "+num+" number: ");
		int sum = 0;
		double average=0;
		for(int initial=0;initial<num;initial++)
		{
			array[initial] = scan.nextInt();
			sum += array[initial];
			average = sum/num;	
		}
		System.out.println("Added Array: "+sum);
		System.out.println("Average: "+average);
		
		scan.close();
	}
}