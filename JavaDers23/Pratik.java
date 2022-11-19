package JavaDers23;

import java.util.Scanner;

public class Pratik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen mail adresinizi giriniz.");
		String email = input.next();
		
		int index =email.indexOf("@");
		String gmail = email.substring(index+1); 
		
		if(email.contains("@")==false) {
			System.out.println("@ isateri olmadan email adresi giremezsiniz.");
			
		}if(email.contains("gmail.com")==false) {
			System.out.println("Gmail hesabi giriniz.");
			
		}if(email.contains("@") && gmail.equals("gmail.com")){
			System.out.println("Dogru gmail hesabi formati.");
		}
		input.close();

	}

}
