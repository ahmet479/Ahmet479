package JavaDers28;

public class JavaDers28 {

	public static void main(String[] args) {
		
		int gun = 4;
	/*	
		if(gun==1){
			System.out.println("pazartesi");	
		}
		if(gun==2){
			System.out.println("sali");	
		}
		if(gun==3){
			System.out.println("carsamba");	
		}
		if(gun==4){
			System.out.println("persembe");	
		}
		if(gun==5){
			System.out.println("cuma");	
		}
		if(gun==6){
			System.out.println("cumartesi");	
		}
		if(gun==7){
			System.out.println("pazar");
			
		}
*/
		
		switch (gun) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
			default:
				System.out.println("Yanlis gun girdiniz");
				break;
		
		}
		System.out.println("Merhabalar");
	}

}
