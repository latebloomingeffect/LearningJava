//Fig 3.2 AccountTest.java
//Using the Account constructor to initialize the variable at the
//time each Account object is created

public class AccountTest
{
	//method main begins execution of Java application
	public static void main(String[] args)
	{
		//create two account objects
		Account account1=new Account("Jane Green");
		Account account2=new Account("John Blue");
		
		//display initial value of name for each account
		System.out.printf("account1 name is:%s%n",account1.getName());
		System.out.printf("account2 name is:%s%n",account2.getName());
	}
}