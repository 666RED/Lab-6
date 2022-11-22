package com.hongchen.lab6;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of celcius: ");
		double celcius1 = scanner.nextDouble();
		System.out.print("Enter another value of celcius: ");
		double celcius2 = scanner.nextDouble();
		System.out.print("Enter the value of fahrenheit: ");
		double fahrenheit1 = scanner.nextDouble();
		System.out.print("Enter another value of fahrenheit: ");
		double fahrenheit2 = scanner.nextDouble();
		
		System.out.println("Celcius\t\tFahrenheit");
		System.out.println(celcius1 + "\t\t" + celciusToFahrenheit(celcius1));
		System.out.println(celcius2 + "\t\t" + celciusToFahrenheit(celcius2));
		
		System.out.println("Fahrenheit\tCelcius");
		fahrenheitToCelcius(fahrenheit1);
		fahrenheitToCelcius(fahrenheit2);
	}
	
	public static double celciusToFahrenheit(double celcius) {
		double fahrenheit = (9.0 / 5) * celcius + 32;
		return fahrenheit;
	}
	
	public static void fahrenheitToCelcius(double fahrenheit) {
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		System.out.printf("%.1f\t\t%.2f\n", fahrenheit, celcius);
	}
}
