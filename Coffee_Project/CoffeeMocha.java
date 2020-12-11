/*
 *	CS55 #1812 Inho Choi 1801787
 *	Make Coffee Project
 *	11 Dec 2020
 * 
 */
public class CoffeeMocha extends Coffee implements HowToMakeDrink{

	// default constructor
	public CoffeeMocha()
	{
		super();
	}
	// constructor parents
	public CoffeeMocha(String ct, double p, String sn,int ep, int m)
	{
		super("CoffeeMocha",p,sn,ep,m);
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		 super.prepare();
	}

	@Override
	void ingredient() {
		// TODO Auto-generated method stub
		System.out.println("Ingredient: MochaPouder, Espressoshot: "+getEspressoshot()+"shots, "+" Milk: "+getMilk()+"oz");
	}

}
