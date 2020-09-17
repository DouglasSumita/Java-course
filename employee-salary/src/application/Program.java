package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		Integer quantityEmployees = sc.nextInt();
		
		for (int i = 0; i < quantityEmployees; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(employees, id)) {
			    System.out.print("Id already taken! Try again: ");	
			    id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee result = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
		
		if (result != null) {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			result.increase(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
			
		sc.close();
	}
	
	public static boolean hasId(List<Employee> employees, int id) {
	    Employee result = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
	    return result != null;
	}

}
