package beans;

public class Order {
	private int oid;
	private String date;
	private String products;
	private long amount;
	
	public void setOid(int oid)
	{
		this.oid=oid;
	}
	
	public int getOid()
	{
		return oid;
	}
	
	public void setDate(String date)
	{
		this.date=date;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setProducts(String product)
	{
		this.products=product;
	}
	
	public String getProducts()
	{
		return products;
	}
	
	public void setAmount(long amount)
	{
		this.amount=amount;
	}
	
	public long getAmount()
	{
		return amount;
	}

}
