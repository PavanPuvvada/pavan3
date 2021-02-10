package assignment1;

public class Assignment {

	public static void main(String[] args) {
		Company cm = new Company("Techouts");
		Employee emp = new Employee(85,2014);
		System.out.println("company name:" +cm.getCompanyName());
		System.out.println("employe name:" +emp.getEmployeeDetails());
	}

}
