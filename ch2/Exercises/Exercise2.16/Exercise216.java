//Exercise 2.16
//Program inputs two integers and compares them to see which one is
//the largest or if they are equal

import java.util.Scanner;	//program uses class Scanner

public class Exercise216
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int number1=input.nextInt();
		
		System.out.print("Enter second integer:");
		int number2=input.nextInt();
		
		if(number1>number2)
		{
			System.out.printf("%d is larger than %d%n",number1,number2);
		}
		
		if(number2>number1)
		{
			System.out.printf("%d is larger than %d%n",number2,number1);
		}
		
		if(number1==number2)
		{
			System.out.printf("%d and %d are equal %n",number1,number2);
		}
	}
}
