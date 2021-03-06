package com.app.calculator;

import java.util.Scanner;

public class Calculator {

	private static float num1 = 0;
	private static float num2 = 0;
	private static float output = 0;

	static Scanner sc = new Scanner(System.in);
	public void printMsg(String msg,float output)
	{
		System.out.println("Result of "+msg+" is "+output);
	}

	private static void add(float a, float b) {
		output = a + b;
	}

	private static void sub(float a, float b) {
		output = a - b;
	}

	private static void mul(float a, float b) {
		output = a * b;
	}

	private static void div(float a, float b) {
		if (b == 0) {
			System.out.println("can't divide by zero ");
			System.out.println("please enter second number again");
			b = sc.nextInt();
		}
		output = a / b;
	}

	public static void main(String[] args) {
		// String userInput="";
		Calculator cal = new Calculator();
		int option = 0;
		if (option != 5) {
			System.out.println("*********************************");
			System.out.println("Welcome to calculator application");
			System.out.println("*********************************");
			System.out.println("Please select the operations to do:");
			System.out.println("Choose 1 for addition");
			System.out.println("Choose 2 for subtraction");
			System.out.println("Choose 3 for multiplication");
			System.out.println("Choose 4 for division");
			System.out.println("Choose 5 for Quit application");
		}
		String userInput = "";

		l1: while (option != 5) {
			userInput = sc.nextLine();
			try {
				option = Integer.parseInt(userInput);
				if (option == 5) {
					System.out.println("*********************Exiting Application ****************");
					break l1;
				} else if (option > 5 && option < 1) {
					System.out.println("option mismatched");
					// break l1;

				}
				if (option == 1 || option == 2 || option == 3 || option == 4) {
					System.out.println("Enter first number");
					num1 = sc.nextInt();
					System.out.println("Enter second number");
					num2 = sc.nextInt();
				}
				if (option == 1) {
					add(num1, num2);
					cal.printMsg("addition",output);
					break l1;

				} else if (option == 2) {
					sub(num1, num2);
					cal.printMsg("subtraction",output);

					break l1;

				} else if (option == 3) {
					mul(num1, num2);
					cal.printMsg("multiplication",output);

					break l1;

				} else if (option == 4) {
					div(num1, num2);
					cal.printMsg("division",output);

					break l1;

				}

			} catch (Exception exp) {
				System.out.println("Please enter a valid number");
				break l1;
			}

		}
	}

}
