package JavaDers26;

import java.util.Scanner;

public class Pratik02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Arabaniz var mi? (true/false");
		boolean araba = input.nextBoolean();
		
		System.out.println("Hava yagmurlu mu?");
		boolean yagmur = input.nextBoolean();
	/*	
		if(araba)
			if(yagmur) {
				System.out.println("Semsiyeye ihtiyacin yok");
				
			}else {
				System.out.println("Arabaya ihtiyacini olmayacak.");
			}
			if(yagmur) {
				System.out.println("Semsiyeye ihtiyacin var");
				
			}else {
				System.out.println("Arabaya ihtiyacini olmayacak.");
	*/
		if(araba && yagmur) {
			System.out.println("Semsiyeye gerek yok.");
			
			if(!araba && yagmur)
				System.out.println("Araba yok, yagmur var, semsiyeye ihtiyacin var.");
			
			}else if(!araba && yagmur) {
				System.out.println("Semsiyeye ihtiyaciniz var.");
			}
		else {
				System.out.println("Araba ve yagmur yok, semsiyeye ihtiyacin yok");
				
			}
		input.close();

	}

}
