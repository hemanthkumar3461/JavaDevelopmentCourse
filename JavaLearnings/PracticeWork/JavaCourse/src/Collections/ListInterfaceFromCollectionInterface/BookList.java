package Collections.ListInterfaceFromCollectionInterface;
import java.awt.print.Book;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class BookList {

	public static void main(String[] args) {
		
		List<Book> bookList = new LinkedList<Book>();
		
		
		
		Book book1 = new Book();//Passing arguments through constructor is needed
		Book book2 = new Book();
		
		bookList.add(book1);
		bookList.add(book2);
		
		Iterator<Book> iterator = bookList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
		
	}
	

}



