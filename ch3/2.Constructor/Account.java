//Fig 3.2 Account.java
//Account class with a constructor to initialize instance variable

public class Account
{
	private String name;	//instance variable
	
	//constructor that initializes name with parameter
	public Account(String name)
	{
		//costructor
		this.name=name;
	}
	
	//method to set the name
	public void setName(String name)
	{
		this.name=name;
	}
	
	//method to retrieve the name
	public String getName()
	{
		return name;
	}
}