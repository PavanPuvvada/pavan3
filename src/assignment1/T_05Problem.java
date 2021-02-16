package assignment1;

import java.util.*;

public class T_05Problem {
	int getMaxNumber() {
		ArrayList<Integer> largest = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		while (sc.hasNextInt()) {
			largest.add(sc.nextInt());
		}
		/*sc.close();*/
		for (int i = 0; i < largest.size(); i++) {
			if (largest.get(i) <= 0)
				return -1;
		}
		return Collections.max(largest);
	}

	public static void main(String[] args) {
		T_05Problem get = new T_05Problem();
		System.out.println(get.getMaxNumber());

	}

}
