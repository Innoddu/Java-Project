/*
 *	CS55 #1812 Inho Choi 
 *	Make Coffee Project
 *	11 Dec 2020
 * 
 */
public abstract class Coffee implements HowToMakeDrink{
	// Create Member variables, and I add espreesoshot and milk
	private String coffeetype;
	private double price;
	private String storename;
	private int espreesoshot;
	private int milk;
	
	// default constructor
	public Coffee()
	{
		
	}
	// initialize constructor
	public Coffee(String ct, double p, String sn,int ep,int m)
	{
		this.coffeetype = ct;
		this.price=p;
		this.storename=sn;
		this.espreesoshot=ep;
		this.milk=m;
	}
	// absstract method
	abstract void ingredient();

	// setter
	public void setCoffetype(String ct)
	{
		this.coffeetype=ct;
	}
	// getter
	public String getCoffetype()
	{
		return this.coffeetype;
	}
	// setter
	public void setPrice(double p)
	{
		this.price=p;
	}
	// getter
	public double getPrice()
	{
		return this.price;
	}
	// setter
	public void setStorename(String sn)
	{
		this.storename=sn;
	}
	// getter
	public String getStorename()
	{
		return this.storename;
	}
	// setter
	public void setEspressoshot(int ep)
	{
		this.espreesoshot=ep;
	}
	// getter
	public int getEspressoshot()
	{
		return this.espreesoshot;
	}
	// setter
	public void setMilk(int m)
	{
		this.milk=m;
	}
	// getter
	public int getMilk()
	{
		return this.milk;
	}
	// interface : print out information
	public void prepare()
	{
		String Prepare = "CoffeeType: "+getCoffetype()+"\n"+
		 				 "Coffee Price: "+getPrice()+"\n"+
		 				 "Store Name: "+getStorename()+"\n";
		System.out.print(Prepare);
	}
}
