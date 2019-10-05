package eu.kniedzwiecki.integracja.books;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main
{	
	public static void main(String[] args)
	{
		lab04();
	}

	static void lab04()
	{
		BookManager bm = null;
		
		try 
		{
			JAXBContext context = JAXBContext.newInstance(BookManager.class);
			Unmarshaller um = context.createUnmarshaller();
			FileReader fr = new FileReader("books2.xml");
			bm = (BookManager) um.unmarshal(fr);
			fr.close();
			
			Marshaller m = context.createMarshaller();
			FileWriter fw = new FileWriter("lab3b.xml");
			
			List<String> authors = new ArrayList<String>();
			authors.add("Krzysztof Niedźwiecki");
			bm.addBook(new Book(
					"KNIEDJ",
					"Laboratorium: Java i XML",
					authors,
					"123-123-123-33",
					2019,
					"ZUT w Szczecinie",
					2137));
			
			m.marshal(bm, fw);
			fw.close();
			
		}
		catch (Exception e) 
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

