package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bedroom;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bedroom[] bedrooms = new Bedroom[10];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		for (int i = 0; i < rooms; i++) {
			
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			bedrooms[room] = new Bedroom(name, email);	
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < bedrooms.length; i++) {
			if (bedrooms[i] != null) {
				System.out.println(i + ": " + bedrooms[i]);
			}
		}
		
		sc.close();
	}

}
