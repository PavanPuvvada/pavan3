package assignment1;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> st = new TreeSet<>();
		st.add("PAVAN");
		st.add("Srikanth");
		st.add("AJAY");
		st.add("VIshnu");
		st.add("PaVAN");
		st.add("aJaY");
		st.add("55");
Iterator itr = st.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
	}
	

}
