package JavaDers23;

import java.util.Scanner;

public class Pratik02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Urun fiyatini giriniz: ");
		float fiyat = input.nextFloat();
		
		System.out.println("Urun adedini giriniz: ");
		float miktar = input.nextFloat();
		
		float normalFiyat = fiyat*miktar;
		float indirimliFiyat = 0.0f;
		
		if(miktar<11) {
			indirimliFiyat = normalFiyat*90/100;	
		}
		if(miktar>10 && miktar<=50) {
				indirimliFiyat = normalFiyat*80/100;
		}
		if(miktar>50) {
				indirimliFiyat = normalFiyat*75/100;
		}
			
			System.out.println("normal : " + normalFiyat);
			System.out.println("indirimli : " + indirimliFiyat);
			
			input.close();

		}		

	}

