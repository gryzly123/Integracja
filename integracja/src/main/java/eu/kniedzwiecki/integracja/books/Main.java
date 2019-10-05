package eu.kniedzwiecki.integracja.books;

import java.util.List;

public class Main
{	
	public static void main(String[] args)
	{
		BookManager bm = new BookManager();
		try
		{
			bm.addBook(new Book("b1", "Koparka dla opornych", "Zdzisław Maliniak", "123456789", 2000, "Helion", 100));
			bm.addBook(new Book("b2", "Java rulez", "James Gosling", "2244668800", 1998, "PWN", 120));
			bm.addBook(new Book("b3", "Sadownictwo dla początkujących", "Steve Jobs", "13579135", 1990, "Nowa Era", 500));
		}
		catch(Exception e)
		{
			System.out.println("Unable to add books to the manager. Exiting");
			return;
		}

		List<Book> w = bm.searchByTitle("Java");
		System.out.println(w);
	}
}
