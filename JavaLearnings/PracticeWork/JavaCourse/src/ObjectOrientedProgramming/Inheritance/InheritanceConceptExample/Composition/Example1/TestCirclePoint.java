package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example1;

import ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example1.Circle;
import ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example1.Point;


public class TestCirclePoint {

	public static void main(String[] args) {
		Point p = new Point(5,5);
		
		Circle c = new Circle(p,5);
		Circle c1 = new Circle(5,5,5);
		System.out.println(c.areaCalculate());
		System.out.println(c1.areaCalculate());

	}

}