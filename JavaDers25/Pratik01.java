package JavaDers25;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bugun gunlerden hangi gun?");
		
		String gun = input.next();
		
		if(gun.equalsIgnoreCase("pazar") ||  (gun.equalsIgnoreCase("pazar"))){
			System.out.println("Bugun hafta sonu.");
			
			}else {
			System.out.println("bugun hafta ici.");
		}
		input.close();

	}

}
