package application;

import java.util.Locale;
import java.util.Scanner;

// import util.CurrencyConverter;
import util.CurrencyConverter2;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Option 1 Using non-static Methods: CurrencyConverter currencyConverter = new
		 * CurrencyConverter();
		 * 
		 * System.out.print("What is the dollar price? "); currencyConverter.dollarPrice
		 * = sc.nextDouble();
		 * 
		 * System.out.print("How many dollars will be bought? ");
		 * currencyConverter.totalDollars = sc.nextDouble();
		 * 
		 * System.out.println("Amount to be paid in reais = " + String.format("%.2f",
		 * currencyConverter.totalPayable()));
		 * 
		 */

		// Option 2 Using static Methods:

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double totalDollars = sc.nextDouble();

		System.out.println("Amount to be paid in reais = "
				+ String.format("%.2f", CurrencyConverter2.totalPayableInReais(dollarPrice, totalDollars)));

		sc.close();
	}

}
