/*
 *	CS55 #1812 Inho Choi 1801787
 *	Make Coffee Project
 *	11 Dec 2020
 * 
 */
public class WhititeChocolateMocha extends Coffee implements HowToMakeDrink{


	// default constructor
	public WhititeChocolateMocha()
	{
		super();
	}
	// consztructor parents
	public WhititeChocolateMocha(String ct, double p, String sn,int ep,int m)
	{
		super("WhiteChocolateMocha",p,sn,ep,m);
	
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.prepare();
		
	}

	@Override
	 void ingredient() {
		// TODO Auto-generated method stub
		System.out.println("Ingredient: WhiteCholoatePouder, Espressoshot: "+getEspressoshot()+"shots, "+" Milk: "+getMilk()+"oz");
	}

}
