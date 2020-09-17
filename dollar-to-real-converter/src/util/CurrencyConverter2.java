package util;

public class CurrencyConverter2 {

	public static final double IOF = 6.00;

	public static double totalPayableInReais(double priceDollar, double amountInDollars) {

		double totalPayableWithoutIOF = amountInDollars * priceDollar;
		double totalPayableWithIOF = totalPayableWithoutIOF + (totalPayableWithoutIOF * IOF / 100);

		return totalPayableWithIOF;
	}
}
