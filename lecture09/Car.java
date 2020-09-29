
public class Car {
	
	private int efficiency; // mi/gal
	
	private double fuel; // gal
	
	// constructor
	public Car(int efficiency) { 
		this.efficiency = efficiency; 
	}
	
	public void drive(double miles) { // distanced traveled in miles
		this.fuel = this.fuel - (miles / this.efficiency);
	}

	// return amount of fuel left in the tank
	public double getGasInTank() {
		return this.fuel;
	}
	
	public static void main(String[] args) {
		Car a = new Car(50);
		
		System.out.println(a);
		//System.out.println(a.fuel);
		System.out.println(a.getGasInTank()); // 0.0
		System.out.println(a.efficiency); // 50
		
		a.drive(100);
		
		//System.out.println(a.fuel);
		System.out.println(a.getGasInTank()); // -2.0
		System.out.println(a.efficiency); // 50
	}

}
