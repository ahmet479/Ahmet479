package JavaDers22;

import java.util.Random;

public class Pratik05 {

	public static void main(String[] args) {
		Random rastgele = new Random();
		int sayi =rastgele.nextInt(101); //0 - 100
		
		if(sayi<=25) 
		{
			System.out.println("Sayi 0 ile 25 araligindadir");
		}
		if(sayi>26 && sayi<50) 
		{
			
			System.out.println("Sayi 26 ile 50 araligindadir.");	
	    }
		if(sayi >51 && sayi<101) 
		{
			
			System.out.println("sayi 50 ile 101 araligindadir.");
	    }
	}
}