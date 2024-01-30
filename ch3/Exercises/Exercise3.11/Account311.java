//Exercise 3.11
//Program inputs strings and integers and out puts account name and 
//account balance

public class Account311
{
	private String name;
	private double balance;
	
	public Account311(String name,double amount)
	{
		this.name=name;
		
		if(amount>0.0)
		{
			this.balance=amount;
		}
	}
	
	public void deposit(double depositAmount)
	{
		if(depositAmount>0.0)
		{
			this.balance=depositAmount;
		}
	}
	
	public void withdrawal(double widthdrawAmount)
	{
		balance=balance-widthdrawAmount;
		
		if(balance<=0.0)
		{
			balance=0.0;
		}
	}
	
	public double getDeposit()
	{
		if(balance==0.00)
		{
			System.out.println("Account Withdrawal exceeded.");
		}
		return balance;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
