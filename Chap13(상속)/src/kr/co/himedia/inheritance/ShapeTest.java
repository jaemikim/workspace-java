package kr.co.himedia.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		
		System.out.println();
		
		Circle circle2 = new Circle(new Point(150, 150), 500);
		circle2.draw();
		
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.draw();
	}
}
