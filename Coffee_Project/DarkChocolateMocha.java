/*
 *	CS55 #1812 Inho Choi 
 *	Make Coffee Project
 *	11 Dec 2020
 * 
 */
public class DarkChocolateMocha extends Coffee implements HowToMakeDrink{

	// default constructor
	public DarkChocolateMocha()
	{
		super();
	}
	// constructor parents
	public DarkChocolateMocha(String ct, double p, String sn,int ep,int m)
	{
		super("DarkChocolateMocha",p,sn,ep,m);
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
	 super.prepare();
	}

	@Override
	 void ingredient() {
		// TODO Auto-generated method stub
		System.out.println("Ingredient: DarkChocolatePoder, Espressoshot: "+getEspressoshot()+"shots, "+" Milk: "+getMilk()+"oz");
	}

}
