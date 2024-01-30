//Exercise 3.14
//Program input s inegers and outputs current date

import java.util.Scanner;	//program uses class Scanner

public class AccountTest314
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		Account314 account1=new Account314(5,10,1965);
		
		System.out.printf("Currrent date is: %d / %d / %d%n",
		account1.getMonth(),account1.getDay(),account1.getYear());
		
		System.out.print("Enter a month between 1 and 12:");
		int month=input.nextInt();
		account1.setMonth(month);
		
		System.out.print("Enter a day between 1 and 31:");
		int day=input.nextInt();
		account1.setDay(day);
		
		System.out.print("Enter a year:");
		int year=input.nextInt();
		account1.setYear(year);
		
		System.out.printf("Currrent date is: %d / %d / %d%n",
		account1.getMonth(),account1.getDay(),account1.getYear());
	}
}
