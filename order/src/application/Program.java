package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.nextLine());
        
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		OrderStatus orderStatus = OrderStatus.valueOf(status);
		
		Order order = new Order(new Date(), client, orderStatus);
		
		System.out.print("How many items to this order? ");
		int i = sc.nextInt();
		
		for (int x = 1; x <= i; x++) {
			
			sc.nextLine();
		    System.out.println("Enter #" + x + " item data: ");
		    System.out.print("Product name: ");
		    String productName = sc.nextLine(); 
		    
		    System.out.print("Product price: ");
		    Double productPrice = sc.nextDouble();
		    
		    Product product = new Product(productName, productPrice);
		    
		    System.out.print("Quantity: ");
		    Integer quantity = sc.nextInt();
		    
		    order.addItem(new OrderItem(product, quantity));
		}
		
		System.out.println();
		System.out.println(order);
		sc.close();
		
	}

}
