package assignment1;

public class CheckArray {
	String [] lang = {"java","c","c++"};
	public void getElements(){
		try{
			
		System.out.println("Index 4:" +lang[4]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);}
		
		System.out.println("Index 0:" +lang[0]);
 }

	public static void main(String[] args) {
		CheckArray c = new CheckArray();
		c.getElements();
		

	}

}
