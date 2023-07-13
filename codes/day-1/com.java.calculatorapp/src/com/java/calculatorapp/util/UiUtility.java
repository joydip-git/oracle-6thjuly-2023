package com.java.calculatorapp.util;

import java.util.Scanner;

public class UiUtility {

	public static void printMenu() {
		System.out.println("----MENU----");
		System.out.println("1. Add \n2. Subtract\n3.Multiply\n4.Divide");
	}

	public static int getchoice(Scanner scanner) {
		System.out.print("\nEnter choice[1/2/3/4]: ");		
		String choice = scanner.next();		
		return Integer.parseInt(choice);
	}

	public static int getValue(Scanner scanner) {
		System.out.print("\nEnter Value: ");
		int value =scanner.nextInt();
		return value;
	}

	public static char getContinuationChoice(Scanner scanner) {
		System.out.print("\nWould you like to continue?[y/Y/n/N]: ");		
		char choice = scanner.next().charAt(0);
		return Character.isUpperCase(choice) ? Character.toLowerCase(choice) : choice;
	}
}
