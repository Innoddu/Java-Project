import java.util.Scanner;

public class taxrates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tax = 0;
		
		System.out.print("Enter the filing status: ");
		int filingStatus = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		if(filingStatus == 0) {
			if(income <= 8350) {
				tax = income * 0.10;
			}
			else if(income <= 33950) {
				tax = (income-8350) * 0.15 + 8350 * 0.10;
			}
			else if(income <= 82250) {
				tax = (income-33950) * 0.25 + (33950 - 8350)*0.15 + 8350 * 0.10;
				}
			else if(income <= 171550) {
				tax = (income-82250) * 0.28 + (82250 -33950)*0.25 +(33950 - 8350)*0.15 +
						8350*0.10;
				}
			else if(income <= 372950) {
				tax = (income-171550) * 0.33 + (171550-82250)*0.28+(82250 - 33950)*0.25 +(33950 - 8350)*0.15 +
						8350*0.10;
				}
			else if(income >= 372951) {
				tax = (income-372950) * 0.35 + (372950-171550)*0.33+ (171550-82250)*0.28+(82250 - 33950)*0.25 +
						(33950-8350)*0.15 +	8350*0.10;
			}
			System.out.print("Tax is " + (int)(tax * 100) / 100.0);
		}
		
		if(filingStatus == 1) {
			if(income <= 16700) {
			    tax = income * 0.10;
				}
				else if(income <= 67900) {
				tax = (income-16700) * 0.15 + 16700 * 0.10;
				}
				else if(income <= 137050) {
					tax = (income-67900) * 0.25 + (67900 - 16700)*0.15 + 16700 * 0.10;
					}
				else if(income <= 208850) {
					tax = (income-137050) * 0.28 + (137050 -67900)*0.25 +(67900 - 16700)*0.15 +
							16700*0.10;
					}
				else if(income <= 372950) {
					tax = (income-208850) * 0.33 + (208850-137050)*0.28+(137050 - 67900)*0.25
                          +(67900 - 16700)*0.15 + 16700*0.10;
							
					}
				else if(income >= 372951) {
					tax = (income-372950) * 0.35 + (372950-208850)*0.33+ (208850-137050)*0.28+(137050 - 67900)*0.25
							+(67900-16700)*0.15 + 16700*0.10;
					}
				System.out.print("Tax is " + (int)(tax * 100) / 100.0);

	}
	
	if(filingStatus == 2) {
		if(income <= 8350) {
				tax = income * 0.10;
			}
			else if(income <= 33950) {
				tax = (income-8350) * 0.15 + 8350 * 0.10;
			}
			else if(income <= 68525) {
				tax = (income-33950) * 0.25 + (33950 - 8350)*0.15 + 8350 * 0.10;
				}
			else if(income <= 104425) {
				tax = (income-68525) * 0.28 + (68525 -33950)*0.25 +(33950 - 8350)*0.15 +
						8350*0.10;
				}
			else if(income <= 186475) {
				tax = (income-104425) * 0.33 + (104425-68525)*0.28+(68525 - 33950)*0.25
                      +(33950 - 8350)*0.15 + 8350*0.10;
						
				}
			else if(income >= 186476) {
				tax = (income-186475) * 0.35 + (186475-104425)*0.33+ (104425-68525)*0.28+(68525 - 33950)*0.25
						+(33950-8350)*0.15 + 8350*0.10;
				}
			System.out.print("Tax is " + (int)(tax * 100) / 100.0);

       }
  
	if(filingStatus == 3) {
		if(income <= 11950) {
				tax = income * 0.10;
			}
			else if(income <= 45500) {
				tax = (income-11950) * 0.15 + 11950 * 0.10;
			}
			else if(income <= 117450) {
				tax = (income-45500) * 0.25 + (45500 - 11950)*0.15 + 11950 * 0.10;
				}
			else if(income <= 190200) {
				tax = (income-117450) * 0.28 + (117450 -45500)*0.25 +(45500 - 11950)*0.15 +
						11950*0.10;
				}
			else if(income <= 372950) {
				tax = (income-190200) * 0.33 + (190200-117450)*0.28+(117450 - 45500)*0.25
                      +(45500 - 11950)*0.15 + 11950*0.10;
						
				}
			else if(income >= 372951) {
				tax = (income-372950) * 0.35 + (372950-190200)*0.33+ (190200-117450)*0.28+(117450 - 45500)*0.25
	                      +(45500 - 11950)*0.15 + 11950*0.10;
				}
			System.out.print("Tax is " + (int)(tax * 100) / 100.0);

       }
	}
}