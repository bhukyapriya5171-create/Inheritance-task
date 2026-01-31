package com.inheritance.task;

public class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}
class car extends Vehicle{
	void speed() {
		System.out.println("Car is moving at 80 km/h");
	}
	


	public static void main(String[] args) {
		car cr =new car();
		cr.run();
		cr.speed();
		
	}

}
