package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) { 
		this.length = length;
		this.width = width;
	}
	public int area() {
		return length*width;
	}
	public int perimeter() {
		return 2*length + 2*width;
	}
	public boolean square() {
		if (width==length) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,4);
		System.out.print(r1.perimeter());
		Rectangle r2 = new Rectangle(5,6);
	}
}
