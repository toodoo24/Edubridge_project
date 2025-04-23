package simple_banking;

public class Bank{
	
	protected static double balance = 0;
	
	public Bank(double balance) {
		super();
		Bank.balance = balance;
	}
	
	
	public void setBalance(double balance) {
		Bank.balance = balance;
	}


	public double getBalance() {
        return balance;
    }
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
	
	public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
