package JavaDers26;

import java.util.Scanner;

public class Pratik05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		int s1 = input.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz");
		int s2  = input.nextInt();
		
		System.out.println("Ucuncu sayiyi giriniz");
		int s3  = input.nextInt();
		
		if(s1>s2  &&  s1>s3 ) {
			System.out.println("Birinci sayi en buyuk "+ s1);
			
		}else if(s2>s1   &&  s2>s3) {
			System.out.println("Ikinci sayi en buyuk :"+ s2);
			
		}else if(s3>s1  &&  s3>s2) {
			System.out.println("Ucuncu sayi en buyuk :" + s3);
			
				}else {
					System.out.println("Sayilar esittir.");
		
			
		}
		input.close();

	}

}
