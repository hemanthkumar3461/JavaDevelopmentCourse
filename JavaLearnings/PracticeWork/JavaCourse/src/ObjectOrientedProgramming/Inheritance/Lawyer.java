package ObjectOrientedProgramming.Inheritance;
/*inheritance uses extends keyword. It is used for code reusing across various classes*/
//Super keyword is from the concept of inheritance which is used to access methods/attributes of parent class from a child class
public class Lawyer extends Employee {
	//This is known as method overriding in java
	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return 25;
	}
	
	public int getClients() {
		return 10;
	}
}
