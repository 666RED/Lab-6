package com.hongchen.lab6;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		int numOfItem = scanner.nextInt();
		
		double[] numArr = new double[numOfItem];
		
		for(int i = 0; i < numOfItem; i++) {
			System.out.println("Enter number " + (i + 1));
			numArr[i] = scanner.nextDouble();
		}
		
		double total = 0.0;
		int numOfElementAboveAverage = 0;
		
		for(double arrItem : numArr) {
			total += arrItem;
		}
		
		double average = total / numOfItem;
		
		for(double arrItem : numArr) {
			if(arrItem > average) {
				numOfElementAboveAverage++;
			}
		}
		
		System.out.printf("Average is %.2f\n", average);
		System.out.println("Number of elements above the average is " + numOfElementAboveAverage);

	}

}
