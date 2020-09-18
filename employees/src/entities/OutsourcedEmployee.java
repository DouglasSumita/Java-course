package entities;

public class OutsourcedEmployee extends Employee {
    
	private static final Double PERCENTAGE_ADDITIONAL = 1.1; 
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final Double payment() {
		return super.payment() + additionalCharge * PERCENTAGE_ADDITIONAL; 
	}
}
