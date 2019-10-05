package eu.kniedzwiecki.integracja.books;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@WebService
@XmlRootElement(name = "books")
public class BookManager
{
	private ArrayList<Book> books;

	@XmlElement(name = "book")
	public ArrayList<Book> getBooks()
	{
		return books;
	}

	public void setBooks(ArrayList<Book> books)
	{
		this.books = books;
	}
	
	public BookManager()
	{
		books = new ArrayList<>();
	}
	
	public void addBook(Book b) throws Exception
	{
		if(b == null)
		{
			throw new Exception();
		}
		
		if(searchByIsbn(b.getIsbn()) != null)	
		{
			throw new Exception();
		}
		
		if(b.getTitle().isEmpty() || b.getAuthor().isEmpty())
		{
			throw new Exception();
		}
		
		books.add(b);
	}
			
	public @WebResult(name="matched_books") List<Book> searchByTitle(@WebParam(name="book_title") String title)
	{
		List<Book> searchResult = new ArrayList<>();
		for(Book b : books)
		{
			if(b.getTitle().contains(title))
				searchResult.add(b);
		}
		return searchResult;
	}
	
	public @WebResult(name="matched_books") List<Book> searchByAuthor(@WebParam(name="book_author") String author)
	{
		List<Book> searchResult = new ArrayList<>();
		for(Book b : books)
		{
			if(b.getAuthor().contains(author))
				searchResult.add(b);
		}
		return searchResult;
	}
	
	public @WebResult(name="matched_book") Book searchByIsbn(@WebParam(name="book_isbn") String isbn)
	{
		for(Book b : books)
		{
			if(b.getIsbn().equals(isbn))
				return b;
		}
		return null;
	}
}
