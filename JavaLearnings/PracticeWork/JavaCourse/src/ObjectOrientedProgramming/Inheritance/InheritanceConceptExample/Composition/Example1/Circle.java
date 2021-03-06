package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example1;

public class Circle //extends Point gives error
//How to implement composition?

{
	int x;
	int y;
	Point center;//In this we have implemented the composition for point and circle, circle has a point but not is a point 
	double radius;
	
	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(int x,int y,double radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}


	public double areaCalculate() {
		return 3.14*radius*radius;
	}
	
}
//Here we are not going to extend Circle from point because it gives a logical error
//Circle and point is not having a is-a relationship
//Circle and point are having a has-a relationship