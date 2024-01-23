//Exercise 2.30
//Program inputs an integer and seperates it by three spaces

import java.util.Scanner;	//program uses class Scanner

public class Exercise230
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer:");
		int number=input.nextInt();
		
		int number1=number/10000;
		int number2=(number/1000)%10;
		int number3=(number/100)%10;
		int number4=(number/10)%10;
		int number5=number%10;
		
		if(number>100000)
		{
			System.out.println("digits are more than 5");
		}
		
		if(number<10000)
		{
			System.out.println("digits are less than 5");
		}
		
		System.out.printf("%d   %d   %d   %d   %d",number1,number2,number3,number4,number5);
	}
}