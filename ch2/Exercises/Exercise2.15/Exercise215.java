//Exercise 2.15
//Program inputs two inegers and displays sum, product, difference 
//and quotient as results of the two integers

import java.util.Scanner;	//program uses class Scanner
public class Exercise215
{
	//method main begins execution of Java program
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int number1=input.nextInt();
		
		System.out.print("Enter second integer:");
		int number2=input.nextInt();
		
		int sum=number1+number2;
		int difference=number1-number2;
		int product=number1*number2;
		int quotient=number1/number2;
		
		System.out.printf("Sum is %d%n",sum);
		System.out.printf("Difference is %d%n",difference);
		System.out.printf("Product is %d%n",product);
		System.out.printf("Quotient is %d%n",quotient);
	}
}
