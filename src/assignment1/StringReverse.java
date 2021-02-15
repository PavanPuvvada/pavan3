package assignment1;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
					String str;
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter a string:");
					str = sc.nextLine();
					System.out.println("After reverse:");
					int i = str.length();
					while(i>0)
					{
						System.out.print(str.charAt(i-1));
						i--;
						
					}

				}

			

			

			



	}


