package eu.kniedzwiecki.autobusy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Endpoint;

public class Main
{	
	public static void main(String[] args)
	{
		FillAndSaveDatabase();
		
		DataBase db = null;
		try
		{
			JAXBContext context = JAXBContext.newInstance(DataBase.class);
			Unmarshaller um = context.createUnmarshaller();
			FileReader fr = new FileReader("autobusy.xml");
			db = (DataBase) um.unmarshal(fr);
			fr.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		if(db != null)
		{
			String url = "http://localhost:420/autobusy";
			Endpoint.publish(url, db);
		}
	}
	
	public static void FillAndSaveDatabase()
	{
		DataBase db = new DataBase();
		
		db.getStops().add(new BusStop(1, "Pogodno",         false));
        db.getStops().add(new BusStop(2, "Unii lubelskiej", false));
        db.getStops().add(new BusStop(3, "Traugutta",       false));
        db.getStops().add(new BusStop(4, "Lodogryf",        false));
        db.getStops().add(new BusStop(5, "Krzekowo",        false));
        db.getStops().add(new BusStop(6, "Konopnickiej",    true ));
        db.getStops().add(new BusStop(7, "Plac kościuszki", false));
        db.getStops().add(new BusStop(8, "Wyszyńskiego",    false));
		
		Line L1 = new Line(0, "3");                    //Pogodno
        L1.getStops().add(new Connection(1, 2, 4, 4)); //Unii lubelskiej
        L1.getStops().add(new Connection(2, 3, 3, 5)); //Traugutta
        L1.getStops().add(new Connection(3, 7, 2, 3)); //Plac kościuszki
        L1.getStops().add(new Connection(7, 4, 2, 3)); //Lodogryf
		db.getLines().add(L1);
					
		Line L2 = new Line(1, "A");                    //Wyszyńskiego
		L2.getStops().add(new Connection(8, 6, 4, 4)); //Konopnickiej
        L2.getStops().add(new Connection(6, 7, 3, 5)); //Plac kościuszki
        L2.getStops().add(new Connection(7, 5, 2, 3)); //Krzekowo
		db.getLines().add(L2);
		
		db.getDrivers().add(new Driver(0, "Jan", "Kowalski"   ));
        db.getDrivers().add(new Driver(1, "Janusz", "Nowak"   ));
        db.getDrivers().add(new Driver(2, "Jasiek", "Nowalski"));

		db.getBuses().add(new Bus(0, "Solaris", "V1" ));
        db.getBuses().add(new Bus(1, "Solaris", "V2" ));
        db.getBuses().add(new Bus(2, "Mercedes", "A1"));
        db.getBuses().add(new Bus(3, "Mercedes", "A3"));
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(DataBase.class);
			Marshaller m = context.createMarshaller();
			FileWriter fw = new FileWriter("autobusy.xml");
			m.marshal(db, fw);
			fw.close();

		} catch (IOException | JAXBException ex)
		{
			System.out.println(ex.toString());
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return;
	}
	
	public static void Test(DataBase db) throws Exception
	{
		List<BusStopSearchResult> tablica = null;
		
		int pid = db.createRun(1, 1, 0, true);
		tablica = db.getStopResults(7);
		System.out.println(tablica.toString());
		
		db.incrementRunStop(pid);
		tablica = db.getStopResults(7);
		System.out.println(tablica.toString());
		
		int pid2 = db.createRun(1, 1, 0, false);
		db.incrementRunStop(pid);
		tablica = db.getStopResults(7);
		System.out.println(tablica.toString());
		
		int pid3 = db.createRun(2, 2, 1, true);
		db.incrementRunStop(pid);
		db.incrementRunStop(pid2);
		tablica = db.getStopResults(7);
		System.out.println(tablica.toString());

		db.incrementRunStop(pid);
		db.incrementRunStop(pid2);
		db.incrementRunStop(pid3);
		tablica = db.getStopResults(7);
		System.out.println(tablica.toString());
		

		db.incrementRunStop(pid);
		db.incrementRunStop(pid2);
		db.incrementRunStop(pid3);
		tablica = db.getStopResults(7);
		System.out.println(tablica.toString());
	}
}
