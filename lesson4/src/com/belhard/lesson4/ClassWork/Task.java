package com.belhard.lesson4.ClassWork;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = getIntFromConsole(sc,10. "enter the number");
		System.out.println("Enter a number =b");
		int b = scanner.nextInt();
		System.out.println("Enter a number =c");
		int c = scanner.nextInt();
		System.out.println("Enter a number =d");
		int d = scanner.nextInt();

		int minAB;
		if (a <= b) {
			minAB = a;
		} else {
			minAB = b;
		}

		int minCD;
		if (c <= d) {
			minCD = c;
		} else
			minCD = d;

		int max;
		if (minAB <= minCD) {
			max = minCD;
		} else {
			max = minAB;
		}
		System.out.println("max{min(a, b), min(c, d) " + max);
	}

	public static int getIntFromConsole(Scanner scanner, int defaultValue) {
		int num;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Not valid data");
			System.out.println("Set to default - " + defaultValue);
			num = defaultValue;
			scanner.next();
		}
		return num;
	}

}
