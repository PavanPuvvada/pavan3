package assignment1;

public class Employee {
	int rating;
	int startYear;
	public Employee(int rating, int startYear) {
		this.rating = rating;
		this.startYear = startYear;
	}
	public String getEmployeeDetails(){
		return "rating: "+this.rating+", start year: "+this.startYear;
		
	}
	

}
