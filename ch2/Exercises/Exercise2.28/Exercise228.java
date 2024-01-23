//Exercise 2.28
//Program enters an integer and calculates the following
//1. The diameter of a circle
//2. The circumference of a circle
//3. The area of a circle

import java.util.Scanner; //program uses class Scanner

public class Exercise228
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer");
		int number=input.nextInt();
		
		System.out.printf("Diameter is %d%n",(number*number));
		System.out.printf("Circumference is %f%n",(2*Math.PI*number));
		System.out.printf("Area is %f%n",(Math.PI*(number*number)));
		
	}
}