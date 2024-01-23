//Exercise 2.26
//Program inputs two integers and determine whether one is a 
//multiple of another

import java.util.Scanner; //program uses class Scanner

public class Exercise226
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int number1=input.nextInt();
		
		System.out.print("Enter second integer:");
		int number2=input.nextInt();
		
		if((number1%number2)==0)
		{
			System.out.printf("%d is a multiple of %d%n",number1,number2);
		}
		
		if((number1%number2)!=0)
		{
			System.out.printf("%d is not a multiple of %d%n",number1,number2);
		}
	}
}