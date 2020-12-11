/*
 * 
 * CS55 #1812 Inho Choi 
 * ItemPurchase list output Program Project
 * 26 Nov 2020
 * 
 */
public class ItemToPurchase {

	// Private fields
	private String item_name ="";
	private String item_description="none";
	private double item_price = 0;
	private int itme_quantity = 0;
	
	public ItemToPurchase()
	{
		super();
	}
	/// Counstructor
	public ItemToPurchase(String n, String d, double p, int q)
	{
	
		this.item_name = n;
		this.item_description = d;
		this.item_price = p;
		this.itme_quantity = q;
	}
	// mutator
	public void setDescription(String d)
	{
		this.item_description=d;
	}
	// accessor
	public String getDescription()
	{
		return item_description;
	}
	public String printItemCost()
	{
		// item name followed by quantatiy, price , subtotal
		return item_name+" "+ itme_quantity + "@ $"+item_price+"= $"+(itme_quantity*item_price);
		
		
		
	}
	public String printItemDescription()
	{
		// output item name and decription
		return  item_name+":" +item_description;
		
	}
	// mutator
	public void setName(String n)
	{
		this.item_name=n;
	}
	// accessor
	public String getName()
	{
		return item_name;
	}
	// mutator
	public void setPrice(double p)
	{
		this.item_price=p;
	}
	// accessor
	public double getPrice()
	{
		return item_price;
	}
	// mutator
	public void setQuantity(int q)
	{
		this.itme_quantity=q;
	}
	// accessor
	public int getQuantity()
	{
		return itme_quantity;
	}
}
