package studio7;

public class Die {

	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
		return (int) (Math.random()*(sides-1))+1;
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(21);
		System.out.print(d1.roll());
	}
}
