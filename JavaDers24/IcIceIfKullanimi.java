package JavaDers24;

import java.util.Scanner;

public class IcIceIfKullanimi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		int sayi = 60;
		
		if(sayi>50) {
			System.out.println("Girdiginiz sayi 50'den buyuk.");
			
		}if(sayi>=70) {
			System.out.println("Girdiginiz sayi 70'e esit ya da buyuk.");
		}
		input.close();

	}

}
