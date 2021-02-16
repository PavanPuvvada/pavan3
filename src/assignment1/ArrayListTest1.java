package assignment1;

import java.util.*;

public class ArrayListTest1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pavan:");
		list.add("Srikanth:");
		list.add("Ajay:");
		list.add("Vicky:");
		list.add("Pavan:");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
