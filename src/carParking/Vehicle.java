package carParking;

public class Vehicle {

	private String model;
	private String regid;
	private int tokennum;
	private String slot;

	// default constructor
	public Vehicle() {
	}

	// constructor
	public Vehicle(String model, String regid, int tokennum,String slot) {
		super();
		this.model = model;
		this.regid = regid;
		this.tokennum = tokennum;
		this.slot =slot;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegid() {
		return regid;
	}

	public void setRegid(String regid) {
		this.regid = regid;
	}

	public int getTokennum() {
		return tokennum;
	}

	public void setTokennum(int tokennum) {
		this.tokennum = tokennum;
	}
	public String getSlot(){
		return slot;
	}
	public void setSlot(String slot){
		this.slot=slot;
	}

	// Print Method
	public void printDetails() {
		System.out.println("Vehicle model is " + this.model);
		System.out.println("Registration ID of the vehicle is " + this.regid);
		System.out.println("TokenNumber of the vehicle is " + this.tokennum);
		System.out.println("Slot number for the vehicle" +this.slot);
	}

}