package JavaDers23;

import java.util.Scanner;

public class JavaDers23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ortalama = scan.nextInt();
		
		if(ortalama < 54) {
			System.out.println("Dersi kaldiniz...");
		}
		if(ortalama >= 45) {
			System.out.println("Tebrikler gectiniz.");
		}
	}

}
