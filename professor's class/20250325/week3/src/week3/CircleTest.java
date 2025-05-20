package week3;

class Circle{
	int radius;
	public Circle(int radius) { this.radius = radius;}
	public String toString() { return "Circle(r="+radius+")";}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle obj = new Circle(10);
		System.out.println(obj);
	}
}
