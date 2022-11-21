package JavaDers27;

public class Ternary {

	public static void main(String[] args) {
		String isim = "";
		int sayi = 75;
		
		isim = sayi > 50 ? (sayi > 80 ? "Ayse" : "Busra"): ("Kubra");
		System.out.println(isim);
		
		if(sayi>50) {
		if(sayi>80) {
			isim= "Ayse";
		}else {
			isim = "Busra";
		}
			
		}else {
			isim = "Kubra";
		}
		
	}

}
