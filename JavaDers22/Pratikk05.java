package JavaDers22;

import java.util.Scanner;

public class Pratikk05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kullanici adinizi : ");
		String username = input.next();
		
		System.out.println("Password giriniz.");
		String password = input.next();
		
		if(username.equals("admin")  &&  (password.equals("12345"))){
			System.out.println("Hos geldiniz..");
			
		}if(!username.equals("admin")) {
			System.out.println("Yanlis username girdiniz..");
		}
		if(!password.equals("12345")) {
			System.out.println("Yanlis password girdiniz.."); 
		}
		input.close();

	}

}
