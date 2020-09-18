package entities;

public class PhysicalPerson extends Person {
    
	private static final Double MAXIMUM_ANNUAL_INCOME_FOR_TAX_15_PERCENT = 20000.0;
	private static final Double MINIMUM_TAX = 0.15;
	private static final Double NORMAL_TAX = 0.25;
	private static final Double PERCENTAGE_OF_MEDICAL_EXPENSES = 0.50;
	
	private Double healthSpending;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		Double tax = MINIMUM_TAX;
		
		if (getAnnualIncome() > MAXIMUM_ANNUAL_INCOME_FOR_TAX_15_PERCENT) {
			tax = NORMAL_TAX;
		}
		
		Double amount = getAnnualIncome() * tax - (healthSpending * PERCENTAGE_OF_MEDICAL_EXPENSES);
		
		if (amount < 0) {
			amount = 0.0;
		}
		return amount;
	}
}
