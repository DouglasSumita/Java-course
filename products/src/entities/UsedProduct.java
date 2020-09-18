package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    
	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getName());
		sb.append(" (used)");
		sb.append(" $ ");
		sb.append(String.format("%.2f", getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(SDF.format(manufactureDate));
		sb.append(")");
		
		return sb.toString();
	}
}
