package studio7;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public double addFraction(int newNum, int newDen) {
		return ((double)(num)/den) + ((double)(newNum)/newDen);
	}
	
	public double mulFraction(int newNum, int newDen) {
		return ((double)(num)/den) * ((double)(newNum)/newDen);
	}
	
	public double reci() {
		return (double)(den)/num;
	}
	

	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);
		System.out.println(f1.addFraction(1,4));
		System.out.println(f1.reci());
	}
	
}
