package assignment1;

public class Association {

	public static void main(String[] args) {
		Company cm = new Company("Techouts");
		Employee emp = new Employee(85,2014);
		System.out.println("company name:"+cm.getCompanyName());
		System.out.println(emp.getEmployeeDetails());
		

	}

}
