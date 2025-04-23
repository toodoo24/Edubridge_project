package simple_banking;

import java.util.Scanner;

public class BankingApp extends Bank{
	
	public BankingApp(double balance) {
		super(balance);
	}

	public static void main(String[] args) {
	int option;
	Scanner sc = new Scanner(System.in);
	
	Bank account = new Bank(balance);
	
	do
	{
		System.out.println("=========Banking Application==========");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("Enter 1 to 4");
		option=sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Available balance :"+ balance);
			break;
		case 2:
			System.out.print("Enter amount to deposit:");
            double deposit = sc.nextDouble();
            account.deposit(deposit);
			break;
		case 3:
			System.out.print("Enter amount to withdraw:");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
			break;
		case 4:
			System.out.println("Thank you!");
            break;
		default:
			System.out.println("Enter value 1 to 4");
			
		}
	} 
	while (option !=4);
	sc.close();
	}
	

}
