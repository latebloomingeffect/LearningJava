//Exercise 3.11
//Program inputs strings and integers and out puts account name and 
//account balance

import java.util.Scanner;	//Program uses class Scanner

public class AccountTest311
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Account311 account1=new Account311("Njabulo",500);
		Account311 account2=new Account311("Sindiswa",850);
		
		System.out.printf("Account1 information:%s R%.2f%n",account1.getName(),account1.getDeposit());
		System.out.printf("Account2 information:%s R%.2f%n",account2.getName(),account2.getDeposit());
		
		System.out.print("Enter withdrawal Amount:");
		double rands=input.nextDouble();
		
		account1.withdrawal(rands);
		
		System.out.printf("%nAccount1 information:%s R%.2f%n",account1.getName(),account1.getDeposit());
		System.out.printf("Account2 information:%s R%.2f%n",account2.getName(),account2.getDeposit());
	}
}
