package Collections.ListInterfaceFromCollectionInterface;


public class Book {
	
	int id;
	String name;
	
	public Book(int id, String name) {
		this.id = id; 
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}