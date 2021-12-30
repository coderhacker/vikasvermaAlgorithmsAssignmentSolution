package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.stocks.Stockers;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("enter no of companies");
		int noofcmp = sc.nextInt();
		double sharPriceNcmp[] = new double[noofcmp];
		boolean priceCompared[] = new boolean[noofcmp];

		Stockers.priceCompare(sharPriceNcmp, priceCompared, noofcmp);

		int choice = 6;
		while (choice != 0) {
			Stockers.stockOperations();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Stockers.ascendingorder(sharPriceNcmp, noofcmp);
				break;
			case 2:
				Stockers.descendingorder(sharPriceNcmp, noofcmp);
				break;
			case 3:
				Stockers.stockRoseToday(priceCompared, noofcmp);
				break;
			case 4:
				Stockers.stockDeclineToday(priceCompared, noofcmp);
				break;
			case 5:
				Stockers.searchStock(sharPriceNcmp, noofcmp);
				break;
			case 0:
				System.out.println("Exited Succesfully");
				break;
			default:
				System.out.println("Please enter valid input");
			}
		}

	}

}
