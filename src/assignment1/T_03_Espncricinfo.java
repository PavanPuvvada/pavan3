package assignment1;

public class T_03_Espncricinfo {
	public static void main(String[] args) {

			Batsman batsman1 = new Batsman();
			batsman1.name = "Virak Kohli";
			batsman1.runsScored = 973;
			batsman1.centuries = 4;
			batsman1.halfCenturies = 7;
			batsman1.ballsFaced = 640;
			batsman1.fours = 83;
			batsman1.sixes = 38;

			System.out.println("Name : " + batsman1.name);
			System.out.println("Runs Scored : " + batsman1.runsScored);
			System.out.println("Balls Faced : " + batsman1.ballsFaced);
			System.out.println("Centuries : " + batsman1.centuries);
			System.out.println("Half Centuries : " + batsman1.halfCenturies);
			System.out.println("Fours : " + batsman1.fours);
			System.out.println("Sixes : " + batsman1.sixes);
			System.out.println("Strike Rate : " + batsman1.getStrikeRate());
			System.out.println("RunsScoredInBoundaries : " + batsman1.getRunsScoredInBoundaries());

			Batsman batsman2 = new Batsman();
			batsman2.setData("AB de Villers", 687, 1, 6, 407, 57, 37);
			System.out.println("Name : " + batsman2.name);
			System.out.println("Runs Scored : " + batsman2.runsScored);
			System.out.println("Balls Faced : " + batsman2.ballsFaced);
			System.out.println("Centuries : " + batsman2.centuries);
			System.out.println("Half Centuries : " + batsman2.halfCenturies);
			System.out.println("Fours : " + batsman2.fours);
			System.out.println("Sixes : " + batsman2.sixes);
			System.out.println("Strike Rate : " + batsman2.getStrikeRate());
			System.out.println("RunsScoredInBoundaries : " + batsman2.getRunsScoredInBoundaries());

	}
}


