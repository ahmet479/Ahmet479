package JavaDers21;

import java.util.Scanner;

public class Pratik3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Gunde kac saat uyuyorsunuz:");
		
		int saat = input.nextInt();
		
		int ay = 30*saat/24;
		int yil = 365*saat/24;
		int omur= 60*365*saat/24;
		
		/*System.out.println("Bir ayda:" + ay + " gun uyuyorsunuz");
		System.out.println("Bir yilda:" + yil + " gun uyuyorsunuz");
		System.out.println("Bir omurde:" + omur + " gun uyuyorsunuz");  */
		
		System.out.println("Bir ayda:" + ay + " gun uyuyorsunuz");
		System.out.println("Bir yilda:" + (yil/30) + " ay uyuyorsunuz");
		System.out.println("Bir omurde:" + (omur/365) + " yil uyuyorsunuz");
		
		
		input.close();

	}

}
