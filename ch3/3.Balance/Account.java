//Fig 3.3 Account.java
//Account class with a double instance variable and deposit method 
//that perform validation

public class Account
{
	private String name;	//instance variable
	private double balance;	//instance variable
	
	//Account constructor that recieves two parameters
	public Account(String name,double balance)
	{
		this.name=name;	//assign name to instance variable
		
		//validate that the balance is greater than 0.0 and
		//instance variable balance keeps its defined value
		if(balance>0.0)
		{
			//if balance is greater than 0.0
			this.balance=balance;	//assign balance to instance variable
			
		}
	}
	
	//method that deposits (adds) only a valid amount
	public void deposit(double depositAmount)
	{
		if(depositAmount>0.0)
		{
			//if the deposit amount is greater than 0.0
			balance=balance+depositAmount;	//assign value to instance variable
		}
	}
	
	//method that returns the account balance
	public double getBalance()
	{
		return balance;
	}
	
	//method that sets the name
	public void setName(String name)
	{
		this.name=name;
	}
	
	//method that retrieves the name
	public String getName()
	{
		return name;
	}
}