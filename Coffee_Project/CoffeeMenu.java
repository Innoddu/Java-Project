/*
 *	CS55 #1812 Inho Choi 1801787
 *	Make Coffee Project
 *	11 Dec 2020
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMenu {

	public static void main(String[] args) {
		
			// Create ArrayList about Coffee
			ArrayList<Coffee> list = new ArrayList<Coffee>();
			Scanner sc = new Scanner(System.in);
			int num= 0;
			
			// Create Obejcts
			WhititeChocolateMocha wcm = new WhititeChocolateMocha();
			DarkChocolateMocha dcm = new DarkChocolateMocha();
			CoffeeMocha cm = new CoffeeMocha();
			PeppermintMocha pmm = new PeppermintMocha();
		
			// Testing Object
			System.out.print("*****TESTING*****\n");
			wcm = new WhititeChocolateMocha("",2,"test",2,4);
			wcm.prepare();
			 System.out.print("\n");
			dcm = new DarkChocolateMocha("",59,"test",2,5);
			dcm.prepare();
			 System.out.print("\n");
			cm = new CoffeeMocha(" ",4,"test",8,6);
			cm.prepare();
			 System.out.print("\n");
			 pmm = new PeppermintMocha("",2,"test",2,1,4);
			pmm.prepare();
			 System.out.print("\n");
			 wcm.ingredient();
			 System.out.print("\n");
			 dcm.ingredient();
			 System.out.print("\n");
			 cm.ingredient();
			 System.out.print("\n");
			 pmm.ingredient();
			 System.out.print("\n");
			System.out.print("****************\n");
			
			
			
			
			
		// Start Menu System
		while(num != -1)
		{
			System.out.print("Which Coffee do you want?\n");
			System.out.print(" 1.Create => WhititeChocolateMocha\n 2.Create => DarkChocolateMocha\n 3.Create =>  CoffeeMocha\n 4.Create =>  PeppermintMocha\n 5. Print All Drinks\n 6. exit\n");
			num = sc.nextInt();
			sc.nextLine();
			
		switch(num)
		{
		case 1:
			
			double p1 = 3.25;
			String s1="Starbucks in SMC";
			System.out.print("You selected WhiteChocolateMocha\n");
			System.out.print("Enter Espreeso Shot: ");
			int es1 = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Milk 8oz or 12oz( Only type integer: ");
			int mm1 = sc.nextInt();
			sc.nextLine();
			
			 wcm = new WhititeChocolateMocha("WhiteChoco",p1,s1,es1,mm1);
			System.out.print("Description:"
					+ "\n WiteChocolateMocha\n Espreeso Shot: " +wcm.getEspressoshot()+"shots\n"
					+" Milk Amount: "+wcm.getMilk()+"oz"+"\n"
					+" Price: " + p1+"\n"
					+" Store name: " + s1+"\n");
			list.add(wcm);
			break;
		case 2:
			double p2 = 3.75;
			String s2="Starbucks in UCLA";
			System.out.print("You selected WhiteChocolateMocha\n");
			System.out.print("Enter Espreeso Shot: ");
			int es2 = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Milk 8oz or 12oz( Only type integer: ");
			int mm2 = sc.nextInt();
			sc.nextLine();
			
			 dcm = new DarkChocolateMocha("DarkChoco",p2,s2,es2,mm2);
			System.out.print("Description:"
					+ "\n DarkChocolateMocha\n Espreeso Shot: " +dcm.getEspressoshot()+"shots\n"
					+" Milk Amount: "+dcm.getMilk()+"oz"+"\n"
					+" Price: " + p2+"\n"
					+" Store name: " + s2+"\n");
			list.add(dcm);
			break;
		case 3:
			double p3 = 2.75;
			String s3="Starbucks in UCBerekely";
			System.out.print("You selected WhiteChocolateMocha\n");
			System.out.print("Enter Espreeso Shot: ");
			int es3 = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Milk 8oz or 12oz( Only type integer: ");
			int mm3 = sc.nextInt();
			sc.nextLine();
			
			 cm = new CoffeeMocha("CoffeeMocha",p3,s3,es3,mm3);
			System.out.print("Description:"
					+ "\n DarkChocolateMocha\n Espreeso Shot: " +cm.getEspressoshot()+"shots\n"
					+" Milk Amount: "+cm.getMilk()+"oz"+"\n"
					+" Price: " + p3+"\n"
					+" Store name: " + s3+"\n");
			list.add(cm);
			break;
		case 4:
			double p4 = 4.55;
			String s4="Starbucks in UCSD";
			System.out.print("You selected WhiteChocolateMocha\n");
			System.out.print("Enter Espreeso Shot: ");
			int es4 = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Milk 8oz or 12oz( Only type integer): ");
			int mm4 = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter PeperminSyrub Amount (1/2/3): ");
			int pa = sc.nextInt();
			sc.nextLine();
			
			 pmm = new PeppermintMocha("CoffeeMocha",p4,s4,es4,mm4,pa);
			System.out.print("Description:"
					+ "\n DarkChocolateMocha\n Espreeso Shot: " +pmm.getEspressoshot()+"shots\n"
					+" Milk Amount: "+pmm.getMilk()+"oz"+"\n"
					+" Pepermint Syrub: " + pmm.getsetPeppermintSyrubAmount()+"\n"
					+" Price: " + p4+"\n"
					+" Store name: " + s4+"\n");
			list.add(pmm);
			break;
		case 5:
			  for(int i = 0; i < list.size(); i++)
			  {
                  list.get(i).prepare();
                  list.get(i).ingredient();
                  System.out.print("\n");
                 
               } 
			break;
		case 6:
			System.out.print("Good Bye :)\n");
			System.exit(0);	
			 System.out.print("\n");
		break;
		default:
			break;
		
		}
	
		}
		
		
	}

}
