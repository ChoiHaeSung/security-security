package week3;

class Circle1{
	int radius;
	public Circle1(int radius) { this.radius = radius;}
	public boolean equals(Circle1 c1) {
		if(radius == c1.radius ) return true;
		else return false;
		
	}
}

public class CircleTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 obj1 = new Circle1(10);
		Circle1 obj2 = new Circle1(10);
		if(obj1==obj2) System.out.println("2개의 원은 같습니다.");
		else System.out.println("2개의 원은 같지 않습니다.");
	}

}
