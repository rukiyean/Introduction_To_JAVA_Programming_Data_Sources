package Bolum10;

import java.util.Date;
import java.util.Scanner;


public class ATMmachine {
	    private int id=0;
	    private double balance=0;
	    private double annualInterestRate=0;
	    private Date dateCreated;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 10 hesap oluþtur, id: 0-9, bakiye: 100
        ATMmachine[] accounts = new ATMmachine[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new ATMmachine(i, 100);
        }
        
        while (true) {
            // Geçerli ID iste
            int id = -1;
            while (true) {
                System.out.print("Enter an id (0 - 9): ");
                id = input.nextInt();
                if (id >= 0 && id <= 9) {
                    break;
                } else {
                    System.out.println("Invalid ID. Try again.");
                }
          }
           
		while(true)
		{
			System.out.println("Main menu\r\n"
					+ "1: check balance\r\n"
					+ "2: withdraw\r\n"
					+ "3: deposit\r\n"
					+ "4: exit");
			
			System.out.println("Enter a choice:");
			int ch = input.nextInt();
	
	        ATMmachine account = accounts[id];
	        
			switch(ch)
			{
			case 1:
				System.out.println("Balance: $" + account.getBalance());
				break;
			case 2:
				 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = input.nextDouble();
                 if (withdrawAmount <= account.getBalance()) {
                     account.withdraw(withdrawAmount);
                 } else {
                     System.out.println("Insufficient balance.");
                 }
				break;
			case 3:
				System.out.print("Enter amount to deposit: ");
                double depositAmount = input.nextDouble();
                account.deposit(depositAmount);
				break;
			case 4:
				System.out.println("Logging out...\n");
				break;
			default:
				 System.out.println("Wrong Choice!!");
	             break;		
			}
			if (ch == 4) {
                break;
            }
		 }
       }
	}
	public ATMmachine() {
        dateCreated = new Date(); // Þu anki tarih
    }
	ATMmachine(int id, double balance)
	{
		this.id=id;
		this.balance=balance;
		this.dateCreated=new Date();
	}
	 public int getId() {
	    return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate / 100) / 12;
	}
	public double getMonthlyInterest()
	{
		return balance * getMonthlyInterestRate();
	}
	
	 // Para çekme
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Para yatýrma
    public void deposit(double amount) {
        balance += amount;
    }
}
