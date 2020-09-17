package entities;

public class Account {
    
	private static final double TAX_WITHDRAW = 5.00;
	
	private int number;
	private String userName;
	private double balance;
	
	public Account(int number, String userName) {
		this.number = number;
		this.userName = userName;
	}
	
	public Account(int number, String userName, double initialDeposit) {
		this.number = number;
		this.userName = userName;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return number;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getBalance() {
		return balance;
	}

    public void deposit(double deposit) {
    	balance += deposit;
    }
    
    public void withdraw(double withdraw) {
    	balance -= TAX_WITHDRAW + withdraw;
    }
    
    public String toString() {
    	return "Account "
    		+ number
    		+ ", Holder: "
    		+ userName
    		+ ", Balance: $ "
    		+ String.format("%.2f", balance);
    }
	
}
