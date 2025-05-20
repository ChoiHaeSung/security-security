package week2;
interface getInfo {
	public double perimeter();
	public double area();
}
class Circle1 implements getInfo{
	double radius;
	Circle1(double radius) { 
		this.radius = radius;
	}
	// 원의 둘레 계산(2ㅠr)
	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	// 워의 면적 계산(ㅠr2)
	public double area() {
		return Math.PI*radius*radius;
	}
}
public class CircleImplementation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 circle=new Circle1(5);
		System.out.println("원의 둘레: "+circle.perimeter());
		System.out.println("원의 면적: "+circle.area());
	}
}
