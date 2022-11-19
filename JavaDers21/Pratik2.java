package JavaDers21;

import java.util.Scanner;

public class Pratik2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*System.out.println("Ilk sayiyi giriniz:");
		int num1 = 20;
		
		System.out.println("Ikinci sayiyi giriniz:");
		int num2 = 5;
		
		System.out.println("Toplam islemin sonucu:" +(num1 + num2) );
		System.out.println("Toplam islemin sonucu:" +(num1 - num2) );
		System.out.println("Toplam islemin sonucu:" +(num1 * num2) );
		System.out.println("Toplam islemin sonucu:" +(num1 / num2) );  */
		
		System.out.println("Ilk sayiyi giriniz:");
		int num1 = input.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz:");
		int num2 = input.nextInt();
		
		System.out.println("Toplam :" +(num1 + num2) );
		System.out.println("Toplam :" +(num1 - num2) );
		System.out.println("Toplam :" +(num1 * num2) );
		System.out.println("Toplam :" +(num1 / num2) );
		
		input.close();

		
	}

}
