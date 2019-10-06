package eu.kniedzwiecki.integracja_klient_java;

import eu.kniedzwiecki.integracja.books.Book;
import eu.kniedzwiecki.integracja.books.BookManager;
import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		URL wsdlUrl = new URL("http://localhost:666/books?wsdl");
		QName qName = new QName("http://books.integracja.kniedzwiecki.eu/", "BookManagerService"); 
		Service service = Service.create(wsdlUrl, qName);
		BookManager bm = service.getPort(BookManager.class);

		List<Book> books1 = bm.getBooks();
		int books1num = books1.size();
		System.out.println("Received " + Integer.toString(books1num) + " book entries.");
		
		Book b = new Book();
		b.setTitle("Super cool Java book");
		b.setAuthor("Krzysztof Niedźwiecki");
		b.setIsbn("123-456-987-1");
		b.setId("SCB-KN");
		b.setPublisher("ZUT w Szczecinie");
		b.setPages(2137);
		b.setYear(2019);
		bm.addBook(b);

		List<Book> books2 = bm.getBooks();
		int books2num = books2.size();
		System.out.println("Received " + Integer.toString(books2num) + " book entries.");

		if(books2num - books1num == 1)
		{
			System.out.println("Our book appears to have been added correctly. Checking:");
			List<Book> books3 = bm.searchByAuthor(b.getAuthor());
			if(books3.size() > 0)
			{
				System.out.println("  * something was found. Is this our book?");

				Book b2 = books3.get(0);
				if(b2.getTitle().equals(b.getTitle()) && b2.getIsbn().equals(b.getIsbn()))
				{
					System.out.println("  * Yes, the book has been found!");
				}
			}
		}
	}
}
