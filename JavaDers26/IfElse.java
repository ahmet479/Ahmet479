package JavaDers26;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String gun = "cuma";
		
		if(gun.equals("pazar")) {
			System.out.println("Pazar gunundesiniz.");
			
		}else if(gun.equals("cumartesi")){
			System.out.println("Bugun cumartesi");
			
			
		}else {
			System.out.println("hafta ici bir gun");
		}
		input.close();

	}

}
