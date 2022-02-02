package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Interface;

public class Rectangle implements Shapesuper {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	
	
}
