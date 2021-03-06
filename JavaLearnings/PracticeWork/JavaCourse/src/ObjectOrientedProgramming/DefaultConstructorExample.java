package ObjectOrientedProgramming;


public class DefaultConstructorExample {

	public static void main(String[] args) {
		
		//States
		String name;
		int age;
		String phone;
		char sex;
		//Constructors are used to intialize the fields. For ex, Strings are null, Integers are 0
		DefaultConstructorExample d1 = new DefaultConstructorExample();// While using this default constructor Strings are null, Integers are 0
		
		DefaultConstructorExample d2 = new DefaultConstructorExample("hem",22,"456789",'m');//This is also called user defined/Parametrized constructor
		
		
		System.out.println("Name of student 1 is " + d1.name);
		System.out.println("Name of student 1 is " + d1.age);
		System.out.println("Name of student 1 is " + d1.phone);
		System.out.println("Name of student 1 is " + d1.sex);
		
		System.out.println("Name of student 2 is " + d2.name);
		System.out.println("Name of student 2 is " + d2.age);
		System.out.println("Name of student 2 is " + d2.phone);
		System.out.println("Name of student 2 is " + d2.sex);
		
		
		
	}

	private String name;
	private int age;
	private String phone;
	private char sex;
		
		//Behaviours - method
		public void eat(){
			System.out.println("Eating");
		}
		
		public void drink(){
			System.out.println("Drinking");
		}
		
		public void run(){
			System.out.println("Running");
		}
//Shape form of the object is defined by the constructor
//Constructor job is to define and hold the states/fields for the object at its creation point
//For crating an object we need a constructor
		public DefaultConstructorExample() //This a default constructor. We can without any fields/states
		{
			
			
		}
		
		public DefaultConstructorExample(String name,int age, String phone, char sex) //This is a full state constructor, Most of times we use this full constructor
		{
			this.name = name;
			this.age = age;
			this.phone = phone;
			this.sex = sex;
			
		}

}
