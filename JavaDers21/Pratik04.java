package JavaDers21;

import java.util.Scanner;

public class Pratik04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Vize notunuz:");
		int vizeNotu = input.nextInt();	
		
		System.out.println("Final notunuz:");
		int finalNotu = input.nextInt();
		
		int ortalama = vizeNotu*40/100 + finalNotu*60/100;
		
		System.out.println("Not ortalamaniz:" + ortalama+ "'dir");
		
		
		input.close();

	}

}
