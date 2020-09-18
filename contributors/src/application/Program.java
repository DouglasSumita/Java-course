package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> persons = new ArrayList<Person>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char personType = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			
			if (personType == 'i') {
				
				System.out.print("Health expenditures: ");
				Double healthSpending = sc.nextDouble();
				persons.add(new PhysicalPerson(name, annualIncome, healthSpending));
				
			} else {
				
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt(); 
				persons.add(new LegalPerson(name, annualIncome, numberOfEmployees));
				
			}
		}
		
		Double sum = 0.0;
				
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Person p : persons) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.tax()));
			sum += p.tax();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();

	}

}
