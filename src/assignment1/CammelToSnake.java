package assignment1;

import java.util.Scanner;
class CammelToSnake {

	public static String camelCaseToSnake(String str) {

		String result = "";
		char c = str.charAt(0);
		result = result + Character.toLowerCase(c);

		for (int i = 1; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				result = result + '_';
				result = result + Character.toLowerCase(ch);
			}

			else {
				result = result + ch;
			}
		}

		return result;
	}

	public static void main(String args[]) {

		String str;
		System.out.print("Enter Cmael case: ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		System.out.print(camelCaseToSnake(str));
	}
}