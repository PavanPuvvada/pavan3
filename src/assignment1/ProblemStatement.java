package assignment1;

import java.util.*;

public class ProblemStatement {
	int getMaxNumber() {
		ArrayList<Integer> largest = new ArrayList<Integer>();

		largest.add(33);
		largest.add(32);
		largest.add(-444);
		Iterator itr = largest.iterator();
		for (int i = 0; i < largest.size(); i++) {
			if (largest.get(i) <= 0)
				return -1;
		}
		return Collections.max(largest);
	}

	public static void main(String[] args) {

		ProblemStatement get = new ProblemStatement();
		System.out.println(get.getMaxNumber());
	}
}
