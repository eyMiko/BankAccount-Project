package Main;

import java.util.Scanner;

public class Menu {

	public void userMenu() {
		Scanner scan = new Scanner(System.in);
		SavingsAccount savingsAccount = new SavingsAccount();
		CheckingAccount checkingAccount = new CheckingAccount();
		BusinessAccount businessAccount = new BusinessAccount();
		int options = 0;
		int choice = 0;
	
		while(options != 4) {
	
			System.out.println("Hello, do you want to access your \n1. Savings Account "
					+ "\n2. Checking Account \n3. Business Account \n4. Exit");
			options = scan.nextInt();
	
			while(choice != 4) {
	
				System.out.println("What do you want to do? \n1. Look at your total \n2. Deposit money"
						+ "\n3. Withdraw money \n4. Exit");
				choice = scan.nextInt();
	
				if (options == 1) {
	
					if (choice == 1) {
						savingsAccount.getTotal();
					}
	
					else if (choice == 2) {
						double value;
						System.out.println("How much do you want to store?");
						value = scan.nextDouble();
						savingsAccount.addAmount(value);
					}
	
					else if (choice == 3) {
						double value;
						System.out.println("How much do you want to withdraw?");
						value = scan.nextDouble();
						savingsAccount.subAmount(value);
					}
				}
	
				else if (options == 2) {
	
					if (choice == 1) {
						checkingAccount.getTotal();
					}
	
					else if (choice == 2) {
						double value;
						System.out.println("How much do you want to store?");
						value = scan.nextDouble();
						checkingAccount.addAmount(value);
					}
	
					else if (choice == 3) {
						double value;
						System.out.println("How much do you want to withdraw?");
						value = scan.nextDouble();
						checkingAccount.subAmount(value);
					}
				}
	
				else if (options == 3) {
	
					if (choice == 1) {
						businessAccount.getTotal();
					}
	
					else if (choice == 2) {
						double value;
						System.out.println("How much do you want to store?");
						value = scan.nextDouble();
						businessAccount.addAmount(value);
					}
	
					else if (choice == 3) {
						double value;
						System.out.println("How much do you want to withdraw?");
						value = scan.nextDouble();
						businessAccount.subAmount(value);
					}
	
				}
	
			}
		}
		scan.close();
	}
}