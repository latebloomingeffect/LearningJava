//Exercise 2.25
//Program inputs an integer and determines which is odd and which 
//is even

import java.util.Scanner;	//Program uses class Scanner

public class Exercise225
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer");
		int number=input.nextInt();
		
		if((number%2)==0)
		{
			System.out.println("number is even");
		}
		
		if((number%2)!=0)
		{
			System.out.println("number is odd");
		}
	}
}