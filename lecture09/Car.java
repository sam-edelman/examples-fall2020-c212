
public class Car {
	
	private int efficiency; // mi/gal
	
	private double fuel; // gal
	
	// constructor
	public Car(int efficiency) { 
		this.efficiency = efficiency; 
	}
	
	public void drive(double miles) { // distanced traveled in miles
		this.fuel = this.fuel - miles/ this.efficiency;
	}

	
	public static void main(String[] args) {
		Car a = new Car(50);
		
		System.out.println(a);
		System.out.println(a.fuel);
		System.out.println(a.efficiency);
		
		a.drive(100);
		
		System.out.println(a.fuel);
		System.out.println(a.efficiency);
	}

}
