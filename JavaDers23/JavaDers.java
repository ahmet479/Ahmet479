package JavaDers23;

import java.util.Scanner;

public class JavaDers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir islem seciniz.");
		String secim = input.next();
		
		System.out.println("Bir sayi giriniz");
		int sayi1 = input.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz.");
		int sayi2 = input.nextInt();
		
		if(secim.equals("+")){
			
			System.out.println("Toplam:" + (sayi1+sayi2));
		}if(secim.equals("-")){
			
			System.out.println("cikarma:" + (sayi1-sayi2));
		}if(secim.equals("*")){
			
			System.out.println("Toplam:" + (sayi1*sayi2));
		}if(secim.equals("/")){
			
			System.out.println("Toplam:" + (sayi1/sayi2));
		}else {
			System.out.println("Yanlis islem girdiniz!");
		}
		input.close();

	}

}
