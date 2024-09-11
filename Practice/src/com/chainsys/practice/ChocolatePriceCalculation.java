package com.chainsys.practice;

import java.util.Scanner;

public class ChocolatePriceCalculation
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the printed price of the chocolates: ");
        double printedPrice = scan.nextDouble();

        double discount = printedPrice * 0.25;
        double priceAfterDiscount = printedPrice - discount;

        double gst = priceAfterDiscount * 0.09;
        double finalPrice = priceAfterDiscount + gst;

        System.out.println("Amount to be paid by the customer: " + finalPrice);

        scan.close();
    }
}