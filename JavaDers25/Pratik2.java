package JavaDers25;

import java.util.Scanner;

public class Pratik2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uzun kenar uzunlugu giriniz : ");
		int UzunKenar = input.nextInt();
		
		System.out.println("Kisa kenar uzunlugu giriniz : ");
		int KisaKenar = input.nextInt();
		
		if(KisaKenar == UzunKenar ) {
			System.out.println("Bu bir kare");
			
		}else {
			System.out.println("Bu bir dikdotgen.");
		}
		input.close();

	}

}
