//Exercise 3.12
//Program prints out an invoice based on information entered by the
//user

public class Account312
{
	private String partNumber;
	private String partDescription;
	private int partQuantity;
	private double partPrice;
	
	public Account312(String number,String description,int quantity,double price)
	{
		this.partNumber=number;
		
		this.partDescription=description;
		
		if(quantity>0)
		{
			this.partQuantity=quantity;
		}
		
		if(price>0.0)
		{
			this.partPrice=price;
		}
	}
	
	public void setNumber(String number)
	{
		this.partNumber=number;
	}
	
	public String getNumber()
	{
		return partNumber;
	} 
	
	public void setDescription(String description)
	{
		this.partDescription=description;
	}
	
	public String getDescription()
	{
		return partDescription;
	}
	
	public void setQuantity(int quantity)
	{
		this.partQuantity=quantity;
	}
	
	public int getQuantity()
	{
		if(partQuantity<=0)
		{
			partQuantity=0;
		}
		return partQuantity;
	}
	
	public void setPrice(double price)
	{
		this.partPrice=price;
	}
	
	public double getPrice()
	{
		if(partPrice<=0.0)
		{
			partPrice=0.0;
		}
		return partPrice;
	}
	
	public double getInvoiceAmount(double price,int quantity)
	{
		if(partPrice>0.0)
		{
			partPrice=price*(double)quantity;
		}
		return partPrice;
	}
}
