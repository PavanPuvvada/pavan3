package carParking;

import java.util.Scanner;

public class CarParkingManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vehicle Model:");
		try {
			String model = sc.next();
			System.out.println("Enter the Vehicle Registration id:");
			String regid = sc.next();
			System.out.println("Enter token num:");
			int tokennum = sc.nextInt();
			System.out.println("Slot number of Vehicle");
			String slot = sc.next();
			Car c = new Car(model, regid, tokennum, slot);
			// Car entered.

			System.out.println("Enter the New Vehicle Model:");
			String model1 = sc.next();
			System.out.println("Enter the New Vehicle Registration number:");
			String regid1 = sc.next();
			System.out.println("Enter token number :");
			int tokennum1 = sc.nextInt();
			System.out.println("Slot number of ");
			String slot1 = sc.next();
			Bike b = new Bike(model1, regid1, tokennum1, slot1);
			// Bike Entered.

			System.out.println("Enter the  Model of any vehicle:");
			String model2 = sc.next();
			System.out.println("Enter the  registration number:");
			String regid2 = sc.next();
			System.out.println("Enter token number :");
			int tokennum2 = sc.nextInt();
			System.out.println("Slot number :");
			String slot2 = sc.next();
			NewCar nc = new NewCar(model2, regid2, tokennum2, slot2);

			CarPark myCarPark = new CarPark();

			// Parking Vehicles
			myCarPark.addVehicles(c);
			myCarPark.addVehicles(b);
			myCarPark.addVehicles(nc);
			System.out.println(" No. of Parked vehicles: " + myCarPark.numOfOccupiedSlots());

			System.out.println("No. of Available Slots: " + myCarPark.numOfAvailableSlots());

			// Printing details
			System.out.println("-----------------------\n");
			System.out.println("List of All Parked Vehicles are: ");
			System.out.println("available slots are"   + myCarPark.numOfAvailableSlots());
			myCarPark.printParkedVehicleDetails();
			myCarPark.numOfAvailableSlots();
			/*
			 * myCarPark.addVehicles(BMW); myCarPark.addVehicles(Superfly);
			 * myCarPark.addVehicles(Hyundai);
			 */
		} catch (Exception e) {
			System.out.println("Enter numbers");

			// recursion

			main(args);
		}

	}
}
