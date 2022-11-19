package JavaDers22;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu metre cinsinden giriniz.");
		float boy1 = input.nextFloat();
		
		System.out.println("Lutfen kilonuzu kilogram cinsinden giriniz.");
		float kilo=input.nextFloat();
		
		float vke = kilo/(boy1*boy1);
		System.out.println("Vucut kitle endexi:" +vke);
		
		if(vke <19.5) {
			System.out.println("Zayifsin daha fazla yemelisin.");
		}
		if(vke>=18.5 && vke <25) {
			System.out.println("Ideal kilodasin.");
		}
		if(vke>=25&& vke <30) {
			System.out.println("Kilolusun biraz egzersiz yapmalisin.");
		}
		if(vke>=30) {
			System.out.println("Obezlik. Sagligina dikkat etmelisin.");
		}
		input.close();

	}

}
