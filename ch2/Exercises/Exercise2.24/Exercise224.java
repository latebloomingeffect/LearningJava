//Exercise 2.24
//Progran inputs five integers to compare which ones are the largest 
//and which one sare the lowest

import java.util.Scanner;	//program uses class Scanner

public class Exercise224
{
	//method main begins execution in Java program
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int number1=input.nextInt();
		
		System.out.print("Enter second integer:");
		int number2=input.nextInt();
		
		System.out.print("Enter third integer:");
		int number3=input.nextInt();
		
		System.out.print("Enter fourth integer:");
		int number4=input.nextInt();
		
		System.out.print("Enter fifth integer:");
		int number5=input.nextInt();
		
		//smallest integers for number 1
		if(number1<number2)
		{
			System.out.printf("Smallest is %d%n",number1);
		}
		
		if(number1<number3)
		{
			System.out.printf("Smallest is %d%n",number1);
		}
		
		if(number1<number4)
		{
			System.out.printf("Smallest is %d%n",number1);
		}
		
		if(number1<number5)
		{
			System.out.printf("Smallest is %d%n",number1);
		}
		
		//smallest integers for number 2
		if(number2<number1)
		{
			System.out.printf("Smallest is %d%n",number2);
		}
		
		if(number2<number3)
		{
			System.out.printf("Smallest is %d%n",number2);
		}
		
		if(number2<number4)
		{
			System.out.printf("Smallest is %d%n",number2);
		}
		
		if(number2<number5)
		{
			System.out.printf("Smallest is %d%n",number2);
		}
		
		//smallest integers for number 3
		if(number3<number1)
		{
			System.out.printf("Smallest is %d%n",number3);
		}
		
		if(number3<number2)
		{
			System.out.printf("Smallest is %d%n",number3);
		}
		
		if(number3<number4)
		{
			System.out.printf("Smallest is %d%n",number3);
		}
		
		if(number3<number5)
		{
			System.out.printf("Smallest is %d%n",number3);
		}
		
		//smallest integers for number 4
		if(number4<number1)
		{
			System.out.printf("Smallest is %d%n",number4);
		}
		
		if(number4<number2)
		{
			System.out.printf("Smallest is %d%n",number4);
		}
		
		if(number4<number3)
		{
			System.out.printf("Smallest is %d%n",number4);
		}
		
		if(number4<number5)
		{
			System.out.printf("Smallest is %d%n",number4);
		}
		
		//smallest integers for number 5
		if(number5<number1)
		{
			System.out.printf("Smallest is %d%n",number5);
		}
		
		if(number5<number2)
		{
			System.out.printf("Smallest is %d%n",number5);
		}
		
		if(number5<number3)
		{
			System.out.printf("Smallest is %d%n",number5);
		}
		
		if(number5<number4)
		{
			System.out.printf("Smallest is %d%n",number5);
		}
		
		//largest integers for number 1
		if(number1>number2)
		{
			System.out.printf("Largest is %d%n",number1);
		}
		
		if(number1>number3)
		{
			System.out.printf("Largest is %d%n",number1);
		}
		
		if(number1>number4)
		{
			System.out.printf("Largest is %d%n",number1);
		}
		
		if(number1>number5)
		{
			System.out.printf("Largest is %d%n",number1);
		}
		
		//largest integers for number 2
		if(number2>number1)
		{
			System.out.printf("Largest is %d%n",number2);
		}
		
		if(number2>number3)
		{
			System.out.printf("Largest is %d%n",number2);
		}
		
		if(number2>number4)
		{
			System.out.printf("Largest is %d%n",number2);
		}
		
		if(number2>number5)
		{
			System.out.printf("Largest is %d%n",number2);
		}
		
		//largest integers for number 3
		if(number3>number1)
		{
			System.out.printf("Largest is %d%n",number3);
		}
		
		if(number3>number2)
		{
			System.out.printf("Largest is %d%n",number3);
		}
		
		if(number3>number4)
		{
			System.out.printf("Largest is %d%n",number3);
		}
		
		if(number3>number5)
		{
			System.out.printf("Largest is %d%n",number3);
		}
		
		//largest integers for number 4
		if(number4>number1)
		{
			System.out.printf("Largest is %d%n",number4);
		}
		
		if(number4>number2)
		{
			System.out.printf("Largest is %d%n",number4);
		}
		
		if(number4>number3)
		{
			System.out.printf("Largest is %d%n",number4);
		}
		
		if(number4>number5)
		{
			System.out.printf("Largest is %d%n",number4);
		}
		
		//largest integers for number 5
		if(number5>number1)
		{
			System.out.printf("Largest is %d%n",number5);
		}
		
		if(number5>number2)
		{
			System.out.printf("Largest is %d%n",number5);
		}
		
		if(number5>number3)
		{
			System.out.printf("Largest is %d%n",number5);
		}
		
		if(number5>number4)
		{
			System.out.printf("Largest is %d%n",number5);
		}
	}
}