package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Interface;


public interface Shapesuper {

	//Code sharing is not useful in this case because each class implements its unique methods/Behavior differently
	//We need to write an interface SHAPE to represent common functionality of all shape
	//Interfaces can not have body they can only contain method declarations and class constants
	//It is the responsibility of the class whoever implements me needs to define my methods
	//Interfaces are abstract methods(These are methods which only declared but not implemented)
	//When we need inherit one class we use extends
	//When we need implement an interface we use implements
	
	double CalculateArea();
	
	double CalculatePerimeter();
	
	
}
