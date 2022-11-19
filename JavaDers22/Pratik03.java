package JavaDers22;

import java.io.Closeable;
import java.util.Random;

public class Pratik03 {

	public static void main(String[] args) {
		Random rastgele = new Random();
		int sayi = rastgele.nextInt(101);
		System.out.println(sayi);
		
		if(sayi<=30) {
			System.out.println("Girdiginiz sayi 0-30 araligindadir.");

		}
		if(sayi>=50) {
			System.out.println("Grdiniz sayi 50-100 araligindadir.");
		}

	}
	

}
