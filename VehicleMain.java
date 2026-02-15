package inheritanceatask;

public class VehicleMain {

	public static void main(String[] args) {
		
				Vehicle car=new Car("Toyota", "Corolla" , 2022, 4);
				car.displayInfo();
				System.out.println("------------");
				Vehicle truck= new Truck("Ford", "f-150", 2021, 1000);
				truck.displayInfo();
				System.out.println("-----------------");
				Vehicle motor =new Motorcycle("Harley-Davidson", "Street Glide" , 2023, true);
				motor.displayInfo();
			}
		

	}


