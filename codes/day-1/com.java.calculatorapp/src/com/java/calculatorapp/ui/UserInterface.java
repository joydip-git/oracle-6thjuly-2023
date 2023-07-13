package com.java.calculatorapp.ui;

import java.util.Scanner;
import com.java.calculatorapp.logic.Calculator;
import com.java.calculatorapp.util.UiUtility;;

public class UserInterface {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char toContinue = 'n';
		Calculator calc = new Calculator();
		do {
			UiUtility.printMenu();
			int choice = UiUtility.getchoice(scanner);
			int firstValue = UiUtility.getValue(scanner);
			int secondValue = UiUtility.getValue(scanner);

			switch (choice) {
			case 1:
				System.out.println("\nCalling Add");
				int addRes = calc.add(firstValue, secondValue);
				System.out.println("Add Result: " + addRes);
				break;

			case 2:
				System.out.println("\nCalling Subtract");
				int subRes = calc.subtract(firstValue, secondValue);
				System.out.println("Subtract Result: " + subRes);
				break;

			case 3:
				System.out.println("\nCalling Mutiply");
				int multiRes = calc.multiply(firstValue, secondValue);
				System.out.println("Mutiply Result: " + multiRes);
				break;

			case 4:
				System.out.println("\nCalling Divide");
				int divRes = calc.divide(firstValue, secondValue);
				System.out.println("Divide Result: " + divRes);
				break;
				
			default:
				System.out.println("\nEnter proper choice ");
				break;
			}
			toContinue = UiUtility.getContinuationChoice(scanner);
		} while ((toContinue != 'n') && (toContinue == 'y'));
		
		scanner.close();		
	}	
}
