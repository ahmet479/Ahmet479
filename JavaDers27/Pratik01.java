package JavaDers27;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Bir sayi giriniz");
		
		int s1 = input.nextInt();
		System.out.println("Ikinci sayi giriniz");
		
		int s2 = input.nextInt();

	//	int buyukSayi =0;

		
		int buyukSayi = s2 > s1 ? s2 : s1 ;
		
	/*	
		if(s2 > s1) {
			buyukSayi = s2;
		
		}else {
			buyukSayi = s1;
		}
		
		
		System.out.println("Buyuk sayi:" + s2);
     */
		System.out.println("buyukSayi:" +buyukSayi);
		input.close();
	}

}
