package Deneme;

public interface Mekanik {
           
		String brand = "Audi";
		
		public void paint(String color);  //Arabanin dis rengini belirleyen method
		
		public void setNumberOfSeats();
		
		public void setEngineCapacity();
		
		public void setFuelType(String FuelType);
		
		public boolean testIt();
		
		public void setSellingPrice();	
		
		public void cruiseControl(boolean isItWanted);
}
