package assignment1;

public class Batsmen {
	private String name;
	private	int runsScored;
	private int centuries;
	private int halfCenturies;
	private	int ballsFaced;
	private int fours;
	private int sixes;
	public Batsmen(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		super();
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}
	public Batsmen() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getHalfCenturies() {
		return halfCenturies;
	}
	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	public int getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

}
