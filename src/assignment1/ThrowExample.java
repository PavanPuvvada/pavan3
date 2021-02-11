package assignment1;

public class ThrowExample {
	int age;
	public static void display(int age){
	if(age>18)
		throw new ArithmeticException("Only Adults are allowed to vote:");
	else
		System.out.println("person with age: "+age + "are allowed to vote:");
	}

	public static void main(String[] args) {

    display(19);
    display(18);
	}

}
