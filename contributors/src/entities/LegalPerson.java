package entities;

public class LegalPerson extends Person {

	private static final Integer NUMBER_MIN_EMPLOYEES_FOR_FEE_14_PERCENT = 11;
    private static final Double MINIMUM_TAX = 0.14;
    private static final Double NORMAL_TAX = 0.16;
    
	private Integer numberOfEmployees;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double tax = NORMAL_TAX;
		if (numberOfEmployees >= NUMBER_MIN_EMPLOYEES_FOR_FEE_14_PERCENT) {
			tax = MINIMUM_TAX;
		}
		return getAnnualIncome() * tax;
	}
	
}
