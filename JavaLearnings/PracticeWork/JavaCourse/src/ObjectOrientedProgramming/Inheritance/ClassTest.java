package ObjectOrientedProgramming.Inheritance;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Lawyer l =new Lawyer();
		Writer w =new Writer();
		JuniorWritter jw =new JuniorWritter();
		
		
		System.out.println(e.getHolidays());
		System.out.println(e.getHours());
		System.out.println(e.getSalary());
		
		System.out.println(l.getClients());
		System.out.println(l.getHolidays());
		System.out.println(l.getHours());
		System.out.println(l.getSalary());
		
		System.out.println(w.booksOver());
		System.out.println(w.costBook());
		System.out.println(w.getHolidays());
		System.out.println(w.getHours());
		System.out.println(w.getSalary());
		
		System.out.println(jw.booksOver());
		System.out.println(jw.costBook());
		System.out.println(jw.getHolidays());
		System.out.println(jw.getHours());
		System.out.println(jw.getSalary());
		System.out.println(jw.pagePrint());
		
		

	}
	

}
