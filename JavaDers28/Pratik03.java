package JavaDers28;

import java.util.Scanner;

public class Pratik03 {

	public static void main(String[] args) {
	/*
		Kullanicinin girmis oldugu 3 basamakli sayinin okunusunu 
		consol'a yazdiran bir program olusturunuz.
		or:123    cikti:yuz yirmi uc
		or:250    cikti:ikiyuz elli
	*/
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz.");
		
		int sayi = input.nextInt();
		
		int birler = sayi%10;   //   3
		
		sayi = sayi/10;         //  123/10=12
		int onlar = sayi%10;
		
		sayi = sayi/10;    //  12/10=1
		int yuzler = sayi%10;    //   1
		
		
		switch(yuzler) {
		case 1:{
			System.out.println("yuz");
		}
		break;
		case 2:{
			System.out.println("ikiyuz");
		}
		break;
		case 3:{
			System.out.println("ucyuz");
		}
		break;
		case 4:{
			System.out.println("dortyuz");
		}
		break;
		case 5:{
			System.out.println("besyuz");
		}
		break;
		case 6:{
			System.out.println("altiyuz");
		}
		break;
		case 7:{
			System.out.println("yediyuz");
		}
		break;
		case 8:{
			System.out.println("sekizyuz");
		}
		break;
		case 9:{
			System.out.println("dokuzyuz");
		}
		}
		switch (onlar){
		case 1:{
			System.out.println("on");
			break;
		}case 2:{
			System.out.println("yirmi");
			break;
		}case 3:{
			System.out.println("otuz");
			break;
		}case 4:{
			System.out.println("kirk");
			break;
		}case 5:{
			System.out.println("elli");
			break;
		}case 6:{
			System.out.println("altmis");
			break;
		}case 7:{
			System.out.println("yetmis");
			break;
		}case 8:{
			System.out.println("seksen");
			break;
		}case 9:{
			System.out.println("doksan");
			break;
		
		}
	
		}
		switch (birler) {
		case 1:
			System.out.println("bir");
			break;
		case 2:{
			System.out.println("iki");
			break;
		}case 3:{
			System.out.println("uc");
			break;
		}case 4:{
			System.out.println("dort");
			break;
		}case 5:{
			System.out.println("bes");
			break;
		}case 6:{
			System.out.println("alti");
			break;
		}case 7:{
			System.out.println("yedi");
			break;
		}case 8:{
			System.out.println("sekiz");
			break;
		}case 9:{
			System.out.println("dokuz");
			break;
		}	
	  }
		input.close();	
	}
}
