package JavaDers21;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		String klavye = input.next();
		
		//System.out.println("Isminiz:" + klavye);
		
		System.out.println("Lutfen yasinizi giriniz:");
		int klavye1 = input.nextInt();
		//System.out.println("yasiniz:" + klavye1);
		
		//System.out.println("Isminiz:" +klavye+ "yasiniz:"+klavye1);
		
		System.out.println("Isminiz:" +klavye+ "\nyasiniz:"+klavye1);

		
		
		
		input.close();
	}

}
