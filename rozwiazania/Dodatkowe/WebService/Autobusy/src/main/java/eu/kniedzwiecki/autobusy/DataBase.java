package eu.kniedzwiecki.autobusy;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@WebService
@XmlRootElement(name = "database")
public class DataBase
{
    DataBase() 
	{
		Stops = new ArrayList<>();
		Lines = new ArrayList<>();
		Drivers = new ArrayList<>();
		Buses = new ArrayList<>();
		Runs = new ArrayList<>();
	}
	
    private List<BusStop> Stops;
    private List<Line> Lines;
    private List<Driver> Drivers;
    private List<Bus> Buses;
    private List<BusRun> Runs;

	@XmlElementWrapper
    @XmlElement(name="stop")
	public List<BusStop> getStops()
	{
		return Stops;
	}

	public void setStops(List<BusStop> stops)
	{
		this.Stops = stops;
	}

	@XmlElementWrapper
    @XmlElement(name="line")
	public List<Line> getLines()
	{
		return Lines;
	}

	public void setLines(List<Line> lines)
	{
		this.Lines = lines;
	}

	@XmlElementWrapper
    @XmlElement(name="driver")
	public List<Driver> getDrivers()
	{
		return Drivers;
	}

	public void setDrivers(List<Driver> drivers)
	{
		this.Drivers = drivers;
	}

	@XmlElementWrapper
    @XmlElement(name="bus")
	public List<Bus> getBuses()
	{
		return Buses;
	}

	public void setBuses(List<Bus> buses)
	{
		this.Buses = buses;
	}
	
	@WebMethod
	DataBase getDatabaseContents()
	{
		return this;
	}
	
	BusStop findStopById(int id)
	{
		for(BusStop bs : Stops)
		{
			if(bs.getId() == id) return bs;
		}
		return null;
	}
	
	Line findLineById(int id)
	{
		for(Line l : Lines)
		{
			if(l.getId() == id) return l;
		}
		return null;
	}
	
	Driver findDriverById(int id)
	{
		for(Driver d : Drivers)
		{
			if(d.getId() == id) return d;
		}
		return null;
	}
	
	Bus findBusById(int id)
	{
		for(Bus b : Buses)
		{
			if(b.getId() == id) return b;
		}
		return null;
	}
	
	
	@WebMethod
	public int createRun(int driverId, int busId, int lineId, boolean direction) throws Exception
	{
		Driver d = findDriverById(driverId);
		Bus b = findBusById(busId);
		Line l = findLineById(lineId);
		if(d == null || b == null || l == null) throw new Exception();
		
		BusRun br = new BusRun(l, d, b, direction);
		if(Runs.add(br))
		{
			return Runs.indexOf(br);
		}
		
		throw new Exception();
	}
	
	@WebMethod
	public boolean incrementRunStop(int runId) throws Exception
	{
		BusRun br = Runs.get(runId);
		if(br == null) throw new Exception();
		
		
		switch(br.incrementStop())
		{
			case INCREMENTED:
				return true;
				
			case FINISHED:
				return false;
		}
		//  case FAIL / default:
				throw new Exception();
	}
	
	@WebMethod
	public List<BusStopSearchResult> getStopResults(int stopId) throws Exception
	{
		List<BusStopSearchResult> Result = new ArrayList<>();
		
		BusStop bs = findStopById(stopId);
		if(bs == null) throw new Exception();
		
		for(BusRun br : Runs)
		{
			int stopIndex = br.getLine().drivesThroughStop(bs);
			if(stopIndex == -1) continue;
			if( br.isDirectionAB() && stopIndex + 1 < br.getCurrentStop()) continue;
			if(!br.isDirectionAB() && stopIndex     > br.getCurrentStop()) continue;
		
			BusStopSearchResult bssr = new BusStopSearchResult();
			List<Connection> stops = br.getLine().getStops();
			
			bssr.ArrivesIn = 0;
			int currentStop = br.getCurrentStop();
			
			if(br.isDirectionAB())
			{
				for(int i = currentStop; i <= stopIndex; ++i)
				{
					Connection connection = br.getLine().getStops().get(i);
					bssr.ArrivesIn += connection.getTimeAB();
				}
			}
			else
			{
				for(int i = currentStop; i > stopIndex; --i)
				{
					Connection connection = br.getLine().getStops().get(i);
					bssr.ArrivesIn += connection.getTimeBA();
				}
			}
			
			bssr.Line = br.getLine().getName();
			bssr.Destination = br.isDirectionAB()
					? findStopById(stops.get(stops.size() - 1).getB()).getName()
					: findStopById(stops.get(0               ).getA()).getName();
			
			Result.add(bssr);
		}
		
		return Result;
	}
}
