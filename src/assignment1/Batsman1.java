package assignment1;

public class Batsman1 {
	String name;
	int runsScored;
	int centuries;
	int halfCenturies;
	int ballsFaced;
	int fours;
	int sixes;

	void setData(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours, int sixes) {
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}

	public float getStrikeRate() {
		return (runsScored * 100 / ballsFaced);
	}

	public int getRunsScoredInBoundaries() {
		return (4 * fours + 6 * sixes);
	}

}
