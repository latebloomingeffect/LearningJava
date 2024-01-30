//Fig 3.2: AccountTest.java
//Creating and manipulation an Account object

import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		//Create a Scanner object to obtain input
		Scanner input=new Scanner(System.in);
		
		//Create an account object and assign it
		Account myAccount=new Account();
		
		//display initial value of name(null)
		System.out.printf("Initial name is %s%n%n",myAccount.getName());
		
		//prompt for and read name
		System.out.println("Please enter the name:");
		String theName=input.nextLine();
		myAccount.setName(theName);
		System.out.println();
		
		//display the name stored in object myAccount
		System.out.printf("Name in object myAccount is:%n%s%n",myAccount.getName());
	}
}