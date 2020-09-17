package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    
	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus orderStatus;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
	}
	
	public Order(Date moment, Client client, OrderStatus orderStatus) {
		this.moment = moment;
		this.client = client;
		this.orderStatus = orderStatus;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderItem> getItens() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem orderItem : items) {
			sum += orderItem.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + SDF.format(moment) + "\n");
		sb.append("Order status: " + orderStatus.toString() + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items:\n");
		for (OrderItem c : items) {
			sb.append(c);
			sb.append("\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
