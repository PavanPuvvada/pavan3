package assignment1;

import java.util.Scanner;

public class Batsmen1 {

	public static void main(String[] args) {
		Batsmen b[] = new Batsmen[2];
		 b[0]= new Batsmen("sehwag", 219, 1,1,128,15,10);
		b[1] = new Batsmen("Raina", 219, 1,1,128,15,10);
		Scanner sc = new Scanner(System.in);
		for(int k = 0; k<=1;k++)
		{
		/*		
		b.getName();
		b.getRunsScored();
		b.getCenturies();
		b.getHalfCenturies();
		b.getFours();
		b.getSixes();*/
		System.out.println("Batsmen Name:" +b[k].getName());
		System.out.println( "runs scored :" +b[k].getRunsScored());
		System.out.println("centuries:" +b[k].getCenturies());
		System.out.println( "HalfCenturies:" +b[k].getHalfCenturies());
		System.out.println("Balls Faced:" +b[k].getBallsFaced());
		System.out.println("Fours:" +b[k].getFours());
		System.out.println("Sixes:" +b[k].getSixes());
	}
	}
}
