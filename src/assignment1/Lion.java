package assignment1;

interface A {
	void eat();
}

public class Lion implements A {
	public void eat() {
		System.out.println("eatingg");
	}

	public static void main(String args[]) {
		Lion objd = new Lion();
		objd.eat();

	}

}