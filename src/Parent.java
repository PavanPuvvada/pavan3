
public class ParentChild {
	int a =10;
	 void show(){
	        System.out.println("parent-show");
	    }
	   
	    void OnlyParentShow(){
	        System.out.println("OnlyParentShow");
	    }
  }
 class Child extends ParentChild{
	int a = 20;
	 void show(){
	        System.out.println("child-show");
	    }
	   
	    void OnlyChildShow(){
	        System.out.println("OnOnlyChildShow");
	    }
}
public class Parent{
	 
    public static void main(String[] args) {
        ParentChild p = new Child();
        p.show();
        System.out.println(p.a);
    } 
 }


