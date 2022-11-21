package JavaDers26;

import java.util.Scanner;

public class Pratik04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz..");
		int sayi1 =input.nextInt();
		
		System.out.println("Ikinci sayi giriniz...");
		int sayi2 = input.nextInt();
		
		if(sayi1 < sayi2) {
			System.out.println("Girdiginiz 2. buyuk.");
			
		}else if(sayi2<sayi1) {
			System.out.println("Girdiginiz 1. buyuk.");
			
	
		}else {
			System.out.println("sayilar esittir.");
			
		}
		input.close();

	}

}
