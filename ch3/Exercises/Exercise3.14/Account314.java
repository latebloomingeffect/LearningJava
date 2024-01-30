//Exercise 3.14
//Program input s inegers and outputs current date

public class Account314
{
	private int currentMonth;
	private int currentDay;
	private int currentYear;
	
	public Account314(int month,int day,int year)
	{
		if(month>0)
		{
			this.currentMonth=month;
		}
		
		if(day>0)
		{
			this.currentDay=day;
		}
		
		if(year>0)
		{
			this.currentYear=year;
		}
	}
	
	public void setMonth(int month)
	{
		this.currentMonth=month;
	}
	
	public int getMonth()
	{
		return currentMonth;
	}
	
	public void setDay(int day)
	{
		this.currentDay=day;
	}
	
	public int getDay()
	{
		return currentDay;
	}
	
	public void setYear(int year)
	{
		this.currentYear=year;
	}
	
	public int getYear()
	{
		return currentYear;
	}
}
