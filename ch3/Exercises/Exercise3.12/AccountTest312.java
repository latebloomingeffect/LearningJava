//Exercise 3.12
//Program prints out an invoice based on information entered by the
//user

import java.util.Scanner;	//program uses class Scanner

public class AccountTest312
{
	//method main bejins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		Account312 account1=new Account312("5010","DiskDrive",1,100.0);
		Account312 account2=new Account312("5020","DiskTray",5,250.0);
		
		System.out.printf("Hardware parts for account1:%n%s%n%s%n%d%n%.2f%n",
		account1.getNumber(),account1.getDescription(),account1.getQuantity(),
		account1.getPrice());
		
		System.out.printf("%nHardware parts for account2:%n%s%n%s%n%d%n%.2f%n",
		account2.getNumber(),account2.getDescription(),account2.getQuantity(),
		account2.getPrice());
		
		System.out.print("Enter partNumber:");
		String number=input.nextLine();
		
		System.out.print("Enter partDescription:");
		String description=input.nextLine();
		
		System.out.print("Enter partQuantity:");
		int quantity=input.nextInt();
		
		System.out.print("Enter partPrice:");
		double price=input.nextDouble();
		
		account1.setNumber(number);
		account1.setDescription(description);
		account1.setQuantity(quantity);
		account1.setPrice(price);
		account1.getInvoiceAmount(price,quantity);
		
		System.out.printf("Hardware parts for account1:%n%s%n%s%n%d%n%.2f%n",
		account1.getNumber(),account1.getDescription(),account1.getQuantity(),
		account1.getPrice());
		
		System.out.printf("Hardware parts for account2:%n%s%n%s%n%d%n%.2f%n",
		account2.getNumber(),account2.getDescription(),account2.getQuantity(),
		account2.getPrice());
	}
}
