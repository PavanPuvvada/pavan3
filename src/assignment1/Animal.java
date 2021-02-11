package assignment1;

public interface Animal {
	void eat();
}
public  class Dog implements Animal {
	public void eat(){
		System.out.println("eat");
	}
	public static void main(String args[]){
		Dog objd = new Dog();
		objd.eat();
		
	}
	

}
