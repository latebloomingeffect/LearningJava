//Fig 2.3 AccountTest.java
//Inputting and Outputting floating-point numbers

import java.util.Scanner;	//program uses class scanner

public class AccountTest
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Account account1=new Account("Jane Green ",50.00);
		Account account2=new Account("John Blue",0.00);
		
		//display initial balance of each object
		System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());
		
		//create a Scanner to obtain input from the keyboard
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1:");
		double depositAmount=input.nextDouble();
		
		System.out.printf("%nAdding %.2f to account1 balance%n",depositAmount);
		account1.deposit(depositAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());
		
		System.out.print("Enter deposit amount for account2:");
		depositAmount=input.nextDouble();
		
		System.out.printf("%nAdding %.2f to account2 balance%n",depositAmount);
		account2.deposit(depositAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());
	}
}