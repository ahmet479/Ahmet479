package Deneme;

public class A4 implements Mekanik, Guvenlik{
	String color;
	int numberOfSeat;
	double engineCapacity;
	String fuelType;
	int price;
	boolean sunRoof;
	boolean cruiseControl;
	double tireDiameter;
	
	@Override
	public void paint(String color) {
		this.color = color;
	}
	@Override
	public void setNumberOfSeats() {
		this.numberOfSeat = 5;
	}
	@Override
	public void setEngineCapacity(){
		this.engineCapacity = 2.0;
	}
	@Override
	public void fuelType(String fuelType) {
		this.fuelType =fuelType;
	}
	@Override
	public void parkingSensor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void passengerAirbag() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void driverAirbag() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hillSupport() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean testIt() {
System.out.println("100KM test sorusu yapildi.");
return false;
	}
	@Override
	public void setSellingPrice() {
		this.price = 1000;
	}
	@Override
	public void sunRoof() {
		this.sunRoof = true;
		this.price += 50;
		
	}
	@Override
	public void cruiseControl(boolean isItWanted) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void llaneKeeping() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFuelType(String FuelType) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[]args) {
		A4 car1 = new A4();
		A4 car2 = new A4();
		car2.testIt();
		car2.driverAirbag();
		
	}
}
