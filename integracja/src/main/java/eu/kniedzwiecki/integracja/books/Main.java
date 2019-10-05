package eu.kniedzwiecki.integracja.books;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main
{	
	public static void main(String[] args)
	{
		lab04();
	}

	static void lab01()
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

	static void lab04()
	{
		BookManager bm = null;
		
		try 
		{
			JAXBContext context = JAXBContext.newInstance(BookManager.class);
			Unmarshaller um = context.createUnmarshaller();
			FileReader fr = new FileReader("books.xml");
			bm = (BookManager) um.unmarshal(fr);
			fr.close();
		}
		catch (JAXBException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		if(bm != null)
		{
			List<Book> bs = bm.searchByTitle("Java");
			System.out.println(bs);
		}
	}
}

