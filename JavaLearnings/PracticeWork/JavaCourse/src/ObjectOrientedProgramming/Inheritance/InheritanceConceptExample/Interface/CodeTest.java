package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Interface;

public class CodeTest {
	public static void main(String[] args) {
		Shapesuper s1 = new Circle(10,10,5);
		Shapesuper s2 = new Rectangle(10,10);
		Shapesuper s3 = new Triangle(10,10,5,5,5);
		
		System.out.println(s1.CalculateArea());
		System.out.println(s1.CalculatePerimeter());
		System.out.println(" ");
		System.out.println(s2.CalculateArea());
		System.out.println(s2.CalculatePerimeter());
		System.out.println(" ");
		System.out.println(s3.CalculateArea());
		System.out.println(s3.CalculatePerimeter());
	}
}
//Use interfaces when you have different method calculations for different things