//Exercise 2.17
//Program inputs three integers and outputs the sum, average, product,
//smallest and largest of the numbers

import java.util.Scanner;	//program uses class Scanner

public class Exercise217
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int number1=input.nextInt();
		
		System.out.print("Enter second integer:");
		int number2=input.nextInt();
		
		System.out.print("Enter third integer:");
		int number3=input.nextInt();
		
		int sum=number1+number2+number3;
		int average=(number1+number2+number3)/3;
		int product=number1*number2*number3;
		
		System.out.printf("Sum is %d%n",sum);
		System.out.printf("Average is %d%n",average);
		System.out.printf("Product is %d%n",product);
		//Smallest number
		if(number1<number2)
		{
			System.out.printf("Smallest number is %d%n",number1);
		}
		
		if(number1<number3)
		{
			System.out.printf("Smallest number is %d%n",number1);
		}
		
		if(number2<number1)
		{
			System.out.printf("Smallest number is %d%n",number2);
		}
		
		if(number2<number3)
		{
			System.out.printf("Smallest number is %d%n",number2);
		}
		
		if(number3<number1)
		{
			System.out.printf("Smallest number is %d%n",number3);
		}
		
		if(number3<number2)
		{
			System.out.printf("Smallest number is %d%n",number3);
		}
		
		//largest number
		if(number1>number2)
		{
			System.out.printf("Largest number is %d%n",number1);
		}
		
		if(number1>number3)
		{
			System.out.printf("Largest number is %d%n",number1);
		}
		
		if(number2>number1)
		{
			System.out.printf("Largest number is %d%n",number2);
		}
		
		if(number2>number3)
		{
			System.out.printf("Largest number is %d%n",number2);
		}
		
		if(number3>number1)
		{
			System.out.printf("Largest number is %d%n",number3);
		}
		
		if(number3>number2)
		{
			System.out.printf("Largest number is %d%n",number3);
		}
		
	}
}
