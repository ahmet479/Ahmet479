package JavaDers22;

import java.util.Scanner;

public class Pratikk02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir gunde kac bardak cay iciyorsun?");
		double bardak = input.nextDouble();
		
		System.out.println("Bir bardak caya kac seker atiyorsunuz?");
		double seker = input.nextDouble();
		
		double yillik = bardak*seker*365*3/100;
		double omur   = bardak*seker*60*365*3/100;
		
		if(seker<=1) {
			System.out.println("Tebrikler, sagliginiza dikkat ediyorsunuz.");
		}
		if(seker>=2 ) {
			System.out.println("Dikkat! Sagliginiza zarar verebilir.");
			System.out.println("Bir yilda:" +yillik+ "\nbir omurde" +omur);
			}
		input.close();

		}
	}
