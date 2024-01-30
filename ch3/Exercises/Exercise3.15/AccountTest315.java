//Exercise 315
//An upgraded version of the Account app that shows the information
//without having diplicated code.

import java.util.Scanner;	//program uses class scanner

public class AccountTest315
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Account315 account1=new Account315("Jane Green ",50.00);
		Account315 account2=new Account315("John Blue",0.00);
		
		//display initial balance of each object
		displayAccount(account1);
		displayAccount(account2);
		
		//create a Scanner to obtain input from the keyboard
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1:");
		double depositAmount=input.nextDouble();
		
		System.out.printf("%nAdding %.2f to account1 balance%n",depositAmount);
		account1.deposit(depositAmount);
		
		//display balances
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter deposit amount for account2:");
		depositAmount=input.nextDouble();
		
		System.out.printf("%nAdding %.2f to account2 balance%n",depositAmount);
		account2.deposit(depositAmount);
		
		//display balances
		displayAccount(account1);
		displayAccount(account2);
	}
	
	public static void displayAccount(Account315 current)
	{
		System.out.printf("%s balance: $%.2f%n",current.getName(),current.getDeposit());
	}
}
