package JavaDers22;

import java.util.Scanner;

public class Pratik04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen TC numaranizi giriniz.");
		long tcNo = input.nextLong();
		
		long ilkHane = tcNo/1000000000;
		String yaziTc = ""+tcNo;
		boolean UzunlukDogruMu = yaziTc.length()== 11;
		
		int sonRakam = (int)(tcNo%10);
		
		if(ilkHane !=0 && UzunlukDogruMu == true && sonRakam%2 !=0 ) {
			System.out.println("Dogrudur");
		}
		
		if(ilkHane == 0) {
			System.out.println("Ilk sayi sifir olamaz.");
		}
		if(UzunlukDogruMu==false) {
			System.out.println("TC No 11 haneden olusmalidir.");
		}
		
		if(sonRakam%2 !=0) {
			System.out.println("Son rakam 2 ile tam bolunebilmelidir.");
			
		}
		else {
			System.out.println("TC numaraniz dogrudur.");
		}
		input.close();

	}

}
