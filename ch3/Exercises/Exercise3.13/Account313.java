//Exercise 3.13
//Program takes input from the user and outputs the name surname and
//salary of the employee pluse adds 10% bonus

public class Account313
{
	private String employeeName;
	private String employeeSurname;
	private double employeeSalary;
	
	public Account313(String name,String surname,double salary)
	{
		this.employeeName=name;
		
		this.employeeSurname=surname;
		
		if(salary>0.0)
		{
			this.employeeSalary=salary;
		}
	}
	
	public void setName(String name)
	{
		this.employeeName=name;
	}
	
	public String getName()
	{
		return employeeName;
	}
	
	public void setSurname(String surname)
	{
		this.employeeSurname=surname;
	}
	
	public String getSurname()
	{
		return employeeSurname;
	}
	
	public void setSalary(double salary)
	{
		if(salary>0.0)
		{
			employeeSalary=((employeeSalary+(salary*10))/100)+salary;
		}
	}
	
	public double getSalary()
	{
		return employeeSalary;
	}
}
