package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example2;

public class CodeTester {
	public static void main(String[] args) {
		Engine e = new Engine(1555,"Ford motor company");
		Car c = new Car(1999,"FORD",e);
		
		System.out.println(c.calculatePrice());
		System.out.println(c.engine.manufacturingCompany);
		System.out.println(c.engine.productionyear);

	}

}
