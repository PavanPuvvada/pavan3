package assignment1;

 interface Ab{
	void eat();
}
public  class Tiger implements Ab {
	 public void eat(){
		System.out.println("eating grass");
	}
	public static void main(String args[]){
		Tiger objd = new Tiger();
		objd.eat();
		
	}
	

}