package JavaDers29;

import java.util.Arrays;

public class Pratik02 {
// 5 tane integer (tamsayi) saklayabilen array olusturunuz
// ve icerisine hherhangi bir data eklemeden console'a yazdiriniz.
// 2--> String	
	
	public static void main(String[] args) {
		
		int []sayilar = new int [7];
		
		sayilar[0] = 4;
		sayilar[1] = 9;
		System.out.println(Arrays.toString(sayilar));
		
		String []insanlar = new String[3];
		System.out.println(Arrays.toString(insanlar));
	}

}
