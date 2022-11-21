package JavaDers27;

public class Pratik02 {

	public static void main(String[] args) {
		
 /*		Kullanicinin vize ve final notlarini kullanarak harf notunu 
		hesaplayan bir "ternary"  yaziniz.
		Not: Ic ice ternary kullanmaniz gerekir. Tek satirda bu islemi yapiniz.
	*/
		
		int vizeNotu = 99;
		int finalNotu = 88;
		int ortalama = vizeNotu*40/100 + finalNotu*60/100;
		
		String harfNotu = ""; 
		
	//	String harfNotu = ortalama<50 ? "FF" : ortalama<75 ? "CC" : ortalama<90 ?  "BB"  : "AA";  
	//	System.out.println(harfNotu);
		
		
		if(ortalama< 50) {
			harfNotu = "FF";
			
		}else if(ortalama<75) {
			harfNotu = "FF";
			

		}else if(ortalama<90) {
			harfNotu = "CC";
			
		}else {
			harfNotu = "AA";
		}
		System.out.println(harfNotu);
		
		

	}

}
