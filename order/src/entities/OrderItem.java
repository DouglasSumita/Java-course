package entities;

public class OrderItem {
    
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.price = product.getPrice();
		this.quantity = quantity;
	}
	
	public Double getPrice() {
	    return price;	
	}
	
	public void setPrice(Double price) {
		this.price = price;
		product.setPrice(price);
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
		price = product.getPrice();
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		String commaSpace = ", ";
		
		sb.append(product);
		sb.append(commaSpace);
		sb.append("Quantity: " + quantity);
		sb.append(commaSpace);
		sb.append("Subtotal: $" + String.format("%.2f", subTotal()));
		
		return sb.toString();
	}
}
