package model.services;

public class PaypalService implements OnlinePaymentService {
    
	private static final double SIMPLE_INTEREST_PERCENT = 0.01;
	private static final double PAYMENT_FEE_PERCENT = 0.02;

	@Override
	public Double paymentFee(Double amount) {
		return amount * PAYMENT_FEE_PERCENT;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * months * SIMPLE_INTEREST_PERCENT;
	}
}
