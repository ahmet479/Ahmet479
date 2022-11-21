package JavaDers26;

import java.util.Scanner;

public class Pratik03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vize notunuzu giriniz.");
		float vizeNotu = input.nextFloat();
		
		System.out.println("Final notuniuzu giriniz");
		float finalNotu = input.nextFloat();
		
		float ortalama = vizeNotu*40/100 + finalNotu*60/100;

		if (ortalama<40) {
			System.out.println("Harf notunuz :  FF");
			
		}
		else if(ortalama<50) {
			System.out.println("Harf notunuz :  DD");
		}
		else if(ortalama<60) {
			System.out.println("Harf notunuz :  CC");
		}
		else if(ortalama<70) {
			System.out.println("Harf notunuz :  BB");
		}
		else if(ortalama<80) {
			System.out.println("Harf notunuz :  BA");
		}
		else  {
			System.out.println("Harf notunuz :  AA");
		}
		input.close();

	}

}
