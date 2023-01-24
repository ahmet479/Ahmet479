package August;
import java.util.Scanner;
public class ForDongusu {

	private static String kelime;
	private static int i;

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir metin giriniz:");
		
		String metin = klavye.nextLine();
		
		int kelimeSayisi = 1;
		
		
		
		
		for(int i=1; i < metin.length();i++){
			
			if(metin.charAt(i)==' '){
				
				
				
				kelimeSayisi++;
				
				System.out.print("girdiginiz metinde"
				+kelimeSayisi+"kelime bulunmaktadir.");
				
				
			}
		klavye.close();
		}
	}

}
