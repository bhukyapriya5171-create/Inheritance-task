package inheritanceatask;

public class Vehicle {
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	void displayInfo() {
		System.out.println(make+" " +model+" " +year);
	}

}
class Car extends Vehicle{
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoor) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoor;
	}
	void displayCarInfo() {
		System.out.println("Number of Door" +numberOfDoors);
	}
}

class Truck extends Vehicle{
	int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	void displayInfo() {
		System.out.println("Cargo Capacity:" +cargoCapacity+"Kg");
	}
	
}
class Motorcycle extends Vehicle{
	boolean hasSidecar;

	public Motorcycle(String make, String model, int year, boolean hasSidecar) {
		super(make, model, year);
		this.hasSidecar = hasSidecar;
	}
	void displayMotorcycleInfo() {
		System.out.println("Has Sidecar:" +hasSidecar);
	}
	
}

