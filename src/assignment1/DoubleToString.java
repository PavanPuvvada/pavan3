package assignment1;
import java.util.Scanner;
public class DoubleToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Double Value");
		Double d = sc.nextDouble();
		String str = Double.toString(d);
		System.out.println(str);
		System.out.println("-----------------:");
		Double ej = Double.parseDouble(str);
		System.out.println(ej);
	System.out.println("-----------------");	

	}

}
