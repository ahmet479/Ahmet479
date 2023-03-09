package Deneme;

public class A3 implements Mekanik {
	public static final double TireDiameter = 17;
	String color;
	int numberOfSeats;
	double engineCapacity;
	String fuelType;
	int price;
	boolean cruiseControl;
	
	@Override
	public void paint(String color) {
		this.color = color;
	}
	@Override
	public void setNumberOfSeats() {
		this.numberOfSeats = 4;

	}
	@Override
	public void setEngineCapacity() {
		this.engineCapacity = 1.6;

	}
	@Override
	public void setFuelType(String FuelType) {
		this.fuelType = fuelType;

	}
	@Override
	public boolean testIt() {
		System.out.println("80KM test surusu yapildi.");
		return true;
	}
	@Override
	public void setSellingPrice() {
		this.price = 800;
	}
	@Override
	public void cruiseControl(boolean isItWanted) {
	if(isItWanted) {
		this.cruiseControl = true;
		this.price += 8;
	}else {
		this.cruiseControl = false;	
		
	}
	}
}
//Inheritance:Ortak kullanima method, ozellik aciyorsunuz. Tek bir sinif extends edilebiliyor.
//Abstract: Tek bir sinif extends edilebiliyor.
//interface: Methodlarin isimleri verilir, siniflarin methodlari doldurmasini istenebilir.
//