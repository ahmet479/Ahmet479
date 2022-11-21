package JavaDers26;

import java.util.Scanner;

public class Pratik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		int sayi = input.nextInt();
		
		if(sayi<0) {
			System.out.println("Sayiniz negatif");
			
		}else if(sayi>0) {
			System.out.println("Sayi pozitif");
		}else {
			System.out.println("Sayi notrdur");
		}
		input.close();

	}

}
