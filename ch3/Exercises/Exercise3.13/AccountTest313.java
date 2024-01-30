//Exercise 3.13
//Program takes input from the user and outputs the name surname and
//salary of the employee pluse adds 10% bonus

import java.util.Scanner;	//program uses class Scanner;

public class AccountTest313
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		Account313 account1=new Account313("Clyton","Makasi",3500);
		Account313 account2=new Account313("Lelethu","Makasi",9500);
		
		System.out.printf("Employee account1 information: %s %s %.2f %n",
		account1.getName(),account1.getSurname(),account1.getSalary());
		
		System.out.printf("%nEmployee account1 information: %s %s %.2f %n",
		account2.getName(),account2.getSurname(),account2.getSalary());
		
		System.out.print("Enter new amount for account1:");
		double increase=input.nextDouble();
		account1.setSalary(increase);
		
		System.out.print("Enter new amount for account2:");
		increase=input.nextDouble();
		account2.setSalary(increase);
		
		System.out.printf("%nEmployee account1 information: %s %s %.2f %n",
		account1.getName(),account1.getSurname(),account1.getSalary());
		
		System.out.printf("%nEmployee account1 information: %s %s %.2f %n",
		account2.getName(),account2.getSurname(),account2.getSalary());
	}
}
