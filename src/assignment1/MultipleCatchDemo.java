package assignment1;

import java.rmi.AccessException;

public class MultipleCatchDemo {
	int num[] = new int[3];
	public void checkException(){
		try {
		num[0] = 0;
		num[2] = 10;
		int result = num[2]/num[0];
		System.out.println(result);
	}
	catch (ArithmeticException |ArrayIndexOutOfBoundsException  e){
		System.out.println("Exception: " +e.getMessage());
			
	}
	}
	
	public static void main(String[] args) {
		MultipleCatchDemo md = new MultipleCatchDemo();
		md.checkException();
		
		

	}

}
