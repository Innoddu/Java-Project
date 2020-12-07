// Inho Choi
// CS55 JAVA PROGRAMING
// project-2020
// ProjectSecMessage
// This program convert text from normal to encode
// and from encoded text to decoded text
import java.util.Scanner;


public class SecretMessage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select = 0;	
		char temp;
		String receive ="";
		String receive2 ="";
		while(select < 3) {
		do {
			System.out.print("Enter 1 to encode, 2 to decode, 3 to quit: ");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt(); 
			sc.nextLine();
		
	
		
      //Users enter what tasks to perform.
	  // 1 is encoding, 2 is decoding, 3 is quit.
		switch(select) {
		
		case 1:
		System.out.println(codeMessage(receive,receive2,true));
		break;
		
		case 2:
		System.out.println(codeMessage(receive,receive2,false));
		break;
		
		case 3:
		System.out.print("Good bye");
		System.exit(0);
		break;
		
		default:
			break;
			
		 }
		}while(select != 1 && select !=2 && select !=3);
		
	}	 
	}
	// If the character input lowercase, it returns true.input uppercase, it return false.
	public static boolean isLowerCaseLetter(char temp) {
		
		return Character.isLowerCase(temp);
		
	}
	//convert lowercase
	public static char toLowerCase(char temp) {
	
		return Character.toLowerCase(temp);

		}
	//codeChar method is performing encoding and decoding
		public static char codeChar(char temp,boolean flag) {
			 String letters = "abcdefghijklmnopqrstuvwxyz"; 
			 String enc = "kngcadsxbvfhjtiumylzqropwe";
			 char change = 'a';
			 
			 
			 
			//flag is true, encoding		
			 if(flag) {	
				 //if character is lowercase, finding string in letters about temp
				 //and get character in enc
				 if(isLowerCaseLetter(temp)) {
					 change = enc.charAt(letters.indexOf(temp));		
				 }
				 //if character is not lowercase, convert lowercase before get character
				 // Then, change it to uppercase.
				 else if(!isLowerCaseLetter(temp)) {
				 temp= toLowerCase(temp);
				 change = enc.charAt(letters.indexOf(temp));	
				 change= Character.toUpperCase(change);
				 }
				   		
			 }
			 //flag is false, decoding
			else if(!flag) {
			if(isLowerCaseLetter(temp)) {
				change = letters.charAt(enc.indexOf(temp));
				}
			else if(!isLowerCaseLetter(temp)) {
				temp= toLowerCase(temp);
				change = letters.charAt(enc.indexOf(temp));
				change= Character.toUpperCase(change);
			}
		}
	    //return performed character
		return change;
			 
   }
		//This method is working about output.
		public static String codeMessage(String receive, String receive2, boolean flag) {
			String enc_str = "";
			String dec_str = "";
			char input = 'a';
		    Scanner sc = new Scanner(System.in);
	
		// if flag is true, output encoded text
			if(flag) {
				 System.out.println("Enter the text to encode: ");
				 receive = sc.nextLine(); 
				// Extract characters by the length of the entered string and save them in the input.
				 for(int i=0; i<receive.length(); i++) {
					 input = receive.charAt(i);	
					 //if input is character, it return true.
					 //And then encoded text save enc_str after adding
					 if(Character.isLetter(input)) {
						 enc_str += SecretMessage.codeChar(input,true);
					 }
					 //if input is not character, it return false.
					 //save it as it is 
					 else
						 enc_str+=input;				 
				}				
			}	
			
		//if flag is false, output decoded text.
		else if(!flag) {
			 System.out.println("Enter the text to  decode: ");
			 receive = sc.nextLine(); 
			
			 for(int i=0; i<receive.length(); i++) {
				 input = receive.charAt(i);	
				 if(Character.isLetter(input)) {
					 dec_str+= SecretMessage.codeChar(input,false);
				 }
				 else
					 dec_str+=input;			 
			 }
		}
		   //return string
			return enc_str+dec_str;
		}
}
