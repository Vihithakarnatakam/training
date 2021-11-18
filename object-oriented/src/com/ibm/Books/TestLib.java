import com.ibm.Books.Book;
import com.ibm.Books.Member;

public class TestLib {
public static void main(String args[])
{
	Book b = new Book("The Alchemist");
	b.status();
	
	Member m = new Member("Jack");
	m.status();
	
	b.issueBook(m);
	b.returnBook(m);
}
}
