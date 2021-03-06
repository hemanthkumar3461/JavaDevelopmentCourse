package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example2;

public class Car extends Vehicle {//inheritance is used to implement is-a relation implementation
	
	//Composition is used to implement has-a relationship
	Engine engine; //Creating an object of engine inside a car
	//Establishing relation between engine and car is done in constructor
	
	
	
	//Car is-a vehicle
	public Car(int modelYear, String companyName,Engine engine) {
		super(modelYear,companyName);
		this.engine= engine;
	}
	
	public void carStart() {
		System.out.println("The car is moving at high speed");
		
	
	}
	
	@Override
		public int calculatePrice() {

			return super.calculatePrice() + 2525;
		}
	
//Java only supports single inheritance, we can only extend one class	
//Java supports multiple inheritance through interfaces 
//Interfaces are common type between several classes without code
//Interfaces consists of set of method declarations, when classes promise to implement an interfaces then it contains only methods 
	
	
	
	
	
	
	
	
	
	
}
