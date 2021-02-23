package carParking;

import java.util.Scanner;

public class Car extends Vehicle {

	// Constructors
	public Car() {
		super();
	}

	public Car(String model, String regid, int tokennum, String slot) {

		super(model, regid, tokennum, slot);
	}

	public static void carm1() {
		Scanner sc = new Scanner(System.in);
		String model = sc.next();
		System.out.println("Enter the Car Registration id:");
		String regid = sc.next();
		System.out.println("Enter token num:");
		int tokennum = sc.nextInt();
		System.out.println("Slot number of Vehicle");
		String slot = sc.next();
		Car BMW = new Car(model, regid, tokennum, slot);
		CarPark myCarPark = new CarPark();
		myCarPark.addVehicles(BMW);	
	}
}
