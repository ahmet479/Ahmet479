package JavaDers28;

import java.util.Scanner;

public class Pratik02 {

	public static void main(String[] args) {
//Kullanicidan almis oldugunuz 2 sayiyi kullanarak dort islem yapiniz
//4 islemden hangisini tercih edeceginizikullanicidan aliniz ve switch case
// yapisi icerisinde islem yapiniz.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen birinci sayiyi giriniz.");
		int s1 = input.nextInt();
		
		System.out.println("Lutfen ikinci sayiyi giriniz.");
		int s2 = input.nextInt();
		
		System.out.println("Islem seciniz\n :toplama + \n :cikarma + \n :carpma + \n :bolme");
		int secim = input.nextInt();
		
		switch (secim) {
		case 1:{
			System.out.println("toplama :" + (s1+s2));
			break;
		}case 2:{
			System.out.println("cikarma :" + (s1-s2));
			break;
				
		}case 3:{
			System.out.println("carpma :" + (s1*s2));
			break;
			
		}case 4:{
			System.out.println("bolme :" + (s1/s2));
			break;
		}default:
			System.out.println("Yanlis islem girdiniz. Lutfen 1,2,3,4"
					+ "rakamlarinlarindan birini giriniz ");
		
	}
		input.close();
	}
}
