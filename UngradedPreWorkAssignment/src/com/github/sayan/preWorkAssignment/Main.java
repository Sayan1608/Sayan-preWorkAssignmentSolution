package com.github.sayan.preWorkAssignment;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.print("Enter number:: ");
		int num = in.nextInt();
		int n = num;
		int revNum = 0;

		while (num != 0) {
			int rem = num % 10;
			num /= 10;
			revNum = revNum * 10 + rem;
		}

		if (n == revNum) {
			System.out.println("Palindrome.\n");
		} else {
			System.out.println("Not Palindrome.\n");
		}

	}

	// function to printPattern

	public void printPattern() {
		System.out.print("Enter the height of the pattern:: ");
		int h = in.nextInt();
		System.out.println();

		for (int i = 1; i <= h; i++) {
			for (int j = h; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.print("Enter the number:: ");
		int num = in.nextInt();
		if (num == 1) {
			System.out.println("Not Prime.");
		} else {
			int flag = 0;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = 1;
					System.out.println("Not Prime.\n");
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Prime");
			}
		}
	}
	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;
		int fiboNum = 0;
		
		System.out.print("Enter the length of the series:: ");
		int l = in.nextInt();
		
		System.out.print(first + " " + second + " ");
		for(int i=2;i<l;i++) {
			fiboNum = first+second;
			first = second;
			second = fiboNum;
			
			System.out.print(fiboNum + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {

		int choice;

		Main ob = new Main();

		do {
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();
			choice = in.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Exiting...\n");
				break;
			case 1:
				ob.checkPalindrome();
				break;
			case 2:
				ob.printPattern();
				break;
			case 3:
				ob.checkPrimeNumber();
				break;
			case 4:
				ob.printFibonacciSeries();
				break;
			default:
				System.out.println("Invalid choice. Enter a valid no.\\n");

			}
		} while (choice != 0);

		System.out.println("Exited Successfully");
		in.close();
	}

}
