
public class Car {
	
	private int efficiency; // mi/gal
	
	private double fuel; // gal
	
	// constructor
	public Car(int efficiency) { 
		this.efficiency = efficiency; 
	}
	
	public void drive(double miles) { // distanced traveled in miles
		this.fuel -=  (miles / this.efficiency);
	}
	
	public void addGas(double gal) {
		this.fuel += gal;
	}

	// return amount of fuel left in the tank
	public double getGasInTank() {
		return this.fuel;
	}
	
	public static void main(String[] args) {
		Car a = new Car(50);
		System.out.println(a);

		a.drive(100);
		
		System.out.println(a.getGasInTank()); // -2.0
		System.out.println(a.efficiency); // 50
		
		a.addGas(3.2); // add fuel to the Gas tank

		System.out.println(a.getGasInTank()); // 1.2
		System.out.println(a.efficiency); // 50
	}

}
