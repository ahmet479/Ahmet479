package JavaDers24;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cinsiyetinizi giriniz.");
		String cinsiyet = input.next();
		
		System.out.println("Yasinizi giriniz.");
		int yas  =  input.nextInt();
		
		if(cinsiyet.equals("erkek")) {
			System.out.println("Cinsiyet : " + cinsiyet);
			
			if(yas>=20) {
				System.out.println("Askere gidebilirsiniz.");
				
			}else {
				System.out.println("Askere gidemezsiniz.");
			}
		}
		input.close();

		
	}

}
