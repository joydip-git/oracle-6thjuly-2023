package com.java.arraydemo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// array of integer values
		// int[] numbers = new int[3];
		// int []numbers = new int[3];
		int numbers[] = new int[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("enter value at numbers[" + i + "]: ");
			numbers[i] = scanner.nextInt();
		}

		System.out.println("\n\n");
		for (int num : numbers) {
			System.out.println(num);
		}

		// array of String values
		System.out.println("\n\n");
		String[] people = new String[3];

		for (int i = 0; i < people.length; i++) {
			System.out.print("enter value at people[" + i + "]: ");
			people[i] = scanner.next();
		}
		scanner.close();

		System.out.println("\n\n");
		for (String name : people) {
			System.out.println(name);
		}

		Employee anilEmp = new Employee();
		Employee sunilEmp = new Employee();

		Employee[] employees = new Employee[2];
		employees[0] = anilEmp;
		employees[1] = sunilEmp;

		// int[][] multiNumbers=new int[2][2];

		int x = 10;
		// int x = 20;
		// test();
		// abcd();
		//Thread t = new Thread(test);
	}

	static void test() {
		int x = 20;
		System.out.println(x);
	}
}
