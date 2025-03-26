package studio7;

public class HockeyPlayer {

	private String name;
	private int number;
	private String shoot;
	private String hand;
	private int goals;
	private int assists;
	private int points;
	
	public HockeyPlayer(String name, int num, String shoot, String hand){
		this.name = name;
		this.number = num;
		this.shoot = shoot;
		this.hand = hand;
		this.goals = 0;
		this.assists = 0;
		this.points = 0;
	}
	
	public void game(int newGoals, int newAssists) {
		this.goals = this.goals + newGoals;
		this.assists = assists + newAssists;
		this.points = this.goals + this.assists;
	}
	public String stats() {
		return "Goals: " + goals + " Assists: " + assists + " Points: " + points;
	}
	
	public String nameNum() {
		return name + ": " + number;
	}
	
	
	public static void main(String[] args) {
		HockeyPlayer p1 = new HockeyPlayer("Stanley", 69, "right", "left");
		System.out.println(p1.nameNum());
		p1.game(15000, 2);
		System.out.println(p1.stats());
	}
}