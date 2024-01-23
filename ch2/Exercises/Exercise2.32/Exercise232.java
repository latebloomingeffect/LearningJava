//Exercise 2.32
//Program inputs five integers and detemines which ones are negative,
//positive or zero

import java.util.Scanner;	//program uses class scanner

public class Exercise232
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer");
		int number1=input.nextInt();
		
		System.out.print("Enter second integer");
		int number2=input.nextInt();
		
		System.out.print("Enter third integer");
		int number3=input.nextInt();
		
		System.out.print("Enter fourth integer");
		int number4=input.nextInt();
		
		System.out.print("Enter fifth integer");
		int number5=input.nextInt();
		
		//number 1 deternimations
		if(number1<0)
		{
			System.out.printf("%d is a negative number %n",number1);
		}
		
		if(number1>0)
		{
			System.out.printf("%d is a positive number %n",number1);
		}
		
		if(number1==0)
		{
			System.out.printf("%d is a negative zero %n",number1);
		}
		
		//number 2 deternimations
		if(number2<0)
		{
			System.out.printf("%d is a negative number %n",number2);
		}
		
		if(number2>0)
		{
			System.out.printf("%d is a positive number %n",number2);
		}
		
		if(number2==0)
		{
			System.out.printf("%d is a negative zero %n",number2);
		}
		
		//number 3 deternimations
		if(number3<0)
		{
			System.out.printf("%d is a negative number %n",number3);
		}
		
		if(number3>0)
		{
			System.out.printf("%d is a positive number %n",number3);
		}
		
		if(number3==0)
		{
			System.out.printf("%d is a negative zero %n",number3);
		}
		
		//number 4 deternimations
		if(number4<0)
		{
			System.out.printf("%d is a negative number %n",number4);
		}
		
		if(number4>0)
		{
			System.out.printf("%d is a positive number %n",number4);
		}
		
		if(number4==0)
		{
			System.out.printf("%d is a negative zero %n",number4);
		}
		
		//number 5 deternimations
		if(number5<0)
		{
			System.out.printf("%d is a negative number %n",number5);
		}
		
		if(number5>0)
		{
			System.out.printf("%d is a positive number %n",number5);
		}
		
		if(number5==0)
		{
			System.out.printf("%d is a negative zero %n",number5);
		}
	}
}