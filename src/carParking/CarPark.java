package carParking;

import java.util.ArrayList;

public class CarPark {

	private static final int maxCapacity = 5;
	private ArrayList<Vehicle> carParkArray; 
	// constructor
	public CarPark() {

		this.carParkArray = new ArrayList<Vehicle>(maxCapacity);
		// This ensures car PArk has five vehicles max

	}

	// Method to find maximum capacity of the car park
	public static int getMaxCapacity() {
		return maxCapacity;
	}

	// Method to find available spots in the car park
	public int numOfAvailableSlots() {
		return this.maxCapacity - this.carParkArray.size();
	}

	// Method to find number of occupied spaces in the car park
	public int numOfOccupiedSlots() {
		return this.carParkArray.size();
	}

	// Method to add vehicles to the car park
	public void addVehicles(Vehicle vehicle) {

		if (this.numOfAvailableSlots() > 0) {
			this.carParkArray.add(vehicle);
			vehicle.printDetails();
			System.out.println("---------------- \n");
		} else {
			System.out.println("Car Park is full");
		}

	}

	// Method to print parked vehicle details
	public void printParkedVehicleDetails() {

		// For every vehicle in array carParkArray
		for (Vehicle vehicle : this.carParkArray) {
			vehicle.printDetails();
			System.out.println("--------------------- \n");

		}

	}
}
