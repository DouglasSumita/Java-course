package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		OnlinePaymentService paymentService = new PaypalService();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		
		sc.nextLine();
		System.out.print("Contract value: ");
		Double amount = sc.nextDouble();
		
		System.out.print("Enter number of installments: ");
		int numberInstallments = sc.nextInt();
		
		Contract contract = new Contract(number, date, amount);
		ContractService contractService = new ContractService(paymentService);
		contractService.processContract(contract, numberInstallments);		
		
		System.out.println("Installments: ");

		for (Installment installment : contract.getInstallments() ) {
			System.out.println(installment);
		}
        
		sc.close();
	}

}
