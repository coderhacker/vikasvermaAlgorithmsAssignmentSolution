package com.greatlearning.stocks;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;

public class Stockers {

	// User Menu

	public static void stockOperations() {
		System.out.println("\n----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-----------------------------------------------");
	}

	/* Price Compare Method */

	@SuppressWarnings("resource")
	public static void priceCompare(double[] price, boolean[] compare, int numb) {

		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < numb; i++) {
			System.out.println("Enter current stock price of the company " + (i + 1));
			price[i] = sc1.nextDouble();
			System.out.println("Whether company's stock price rose today compared to yesterday?");
			compare[i] = sc1.nextBoolean();
		}
	}

	/* Display the companies stock prices in ascending order */

	public static void ascendingorder(double[] price, int numb) {
		MergeSortImplementation mergesortprice = new MergeSortImplementation();
		mergesortprice.sort(price, 0, numb - 1);
		System.out.println("Stock prices in ascending order are: ");
		for (int k = numb - 1; k >= 0; k--)
			System.out.print(price[k] + " ");
	}

	/* Display the companies stock prices in descending order */

	public static void descendingorder(double[] price, int numb) {
		MergeSortImplementation mergesortprice = new MergeSortImplementation();
		mergesortprice.sort(price, 0, numb - 1);
		System.out.println("Stock prices in descending order are: ");
		for (int j = 0; j < numb; j++)
			System.out.print(price[j] + " ");
	}

	/* Display the total no of companies for which stock prices rose today */

	public static void stockRoseToday(boolean[] comp, int numb) {
		int count = 0;
		for (int l = 0; l < numb; l++)
			if (comp[l] == true)
				count++;
		System.out.println("Total no of companies whose stock price rose today:" + count);
	}

	/* Display the total no of companies for which stock prices declined today */

	public static void stockDeclineToday(boolean[] comp, int numb) {
		int count = 0;
		for (int l = 0; l < numb; l++)
			if (comp[l] == false)
				count++;
		System.out.println("Total no of companies whose stock price declined today:" + count);
	}

	/* Search a specific stock price */

	public static void searchStock(double[] price, int numb) {
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the key value");
		double key = sc2.nextDouble();
		boolean flag = false;
		for (int i = 0; i < numb; i++)
			if (price[i] == key)
				flag = true;
		if (flag == true)
			System.out.println("Stock of value " + key + " is present");
		else
			System.out.println("Value not found");
	}
}
