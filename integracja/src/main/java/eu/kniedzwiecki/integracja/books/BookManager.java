package eu.kniedzwiecki.integracja.books;

import java.util.ArrayList;
import java.util.List;

public class BookManager
{
	private ArrayList<Book> books;
	
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
		
		if(searchByIsbn(b.getIsbn()) == b)	
		{
			throw new Exception();
		}
		
		books.add(b);
	}
			
	public List<Book> searchByTitle(String title)
	{
		List<Book> searchResult = new ArrayList<>();
		for(Book b : books)
		{
			if(b.getTitle().contains(title))
				searchResult.add(b);
		}
		return searchResult;
	}
	
	public List<Book> searchByAuthor(String author)
	{
		List<Book> searchResult = new ArrayList<>();
		for(Book b : books)
		{
			if(b.getAuthor().contains(author))
				searchResult.add(b);
		}
		return searchResult;
	}
	
	public Book searchByIsbn(String isbn)
	{
		for(Book b : books)
		{
			if(b.getIsbn().equals(isbn))
				return b;
		}
		return null;
	}
}
