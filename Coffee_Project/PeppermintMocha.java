/*
 *	CS55 #1812 Inho Choi 1801787
 *	Make Coffee Project
 *	11 Dec 2020
 * 
 */
public class PeppermintMocha extends Coffee implements HowToMakeDrink{

	//Create Member variable
	private int peppermintSyrubAmount;

	// default constructor
	public PeppermintMocha()
	{
		super();
	}
	// constructor parents
	public PeppermintMocha(String ct,double p, String sn,int ep, int m,int psa)
	{
		super("PepperMint",p,sn,ep,m);
		this.peppermintSyrubAmount=psa;
	}
	// setter
	public void setPeppermintSyrubAmount(int psa)
	{
		this.peppermintSyrubAmount=psa;
	}
	// getter
	public int getsetPeppermintSyrubAmount()
	{
		return this.peppermintSyrubAmount;
	}
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("PeppermintSyrubAmout: "+getsetPeppermintSyrubAmount()+"\n");
		
	}

	@Override
	void ingredient() {
		// TODO Auto-generated method stub
		System.out.println("Ingredient: DarkChocolatePoder, Espressoshot: "+getEspressoshot()+"shots, "+" Milk: "+getMilk()+"oz"
				+"PepermintSyrub: "+getsetPeppermintSyrubAmount()+"\n");
	}

}
