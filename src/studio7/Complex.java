package studio7;

public class Complex {

	private double real;
	private double fake;
	
	public Complex(double real, double fake) {
		this.real = real;
		this.fake = fake;
	}
	
	public String makeComplex() {
		return (real) + "+" + (fake) + "i";
	}
	
	public String addComplex(double newReal, double newFake) {
		return (real+newReal) + "+" + (fake+newFake) + "i";
	}
	
	
	public static void main(String[] args) {
		Complex c1 = new Complex(2,3);
		System.out.print(c1.addComplex(62, 7));
	}
}
