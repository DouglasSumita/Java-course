package util;

public class CurrencyConverter {

	public static final double IOF = 6.00;

	public double dollarPrice;
	public double totalDollars;

	public double totalPayable() {
		return (totalDollars * dollarPrice) + (totalDollars * dollarPrice * IOF / 100);
	}
}
