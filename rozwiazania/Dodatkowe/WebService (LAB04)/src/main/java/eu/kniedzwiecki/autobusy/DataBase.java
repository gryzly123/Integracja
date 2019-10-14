package eu.kniedzwiecki.autobusy;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
	@WebMethod
	public @WebResult(name="stop") List<BusStop> getStops()
	{
		return Stops;
	}

	@WebMethod
	public void setStops(
			@WebParam(name="stops") List<BusStop> stops)
	{
		this.Stops = stops;
	}

	@XmlElementWrapper
    @XmlElement(name="line")
	@WebMethod
	public @WebResult(name="line") List<Line> getLines()
	{
		return Lines;
	}

	@WebMethod
	public void setLines(
			@WebParam(name="lines") List<Line> lines)
	{
		this.Lines = lines;
	}

	@XmlElementWrapper
    @XmlElement(name="driver")
	@WebMethod
	public @WebResult(name="driver") List<Driver> getDrivers()
	{
		return Drivers;
	}

	@WebMethod
	public void setDrivers(
			@WebParam(name="drivers") List<Driver> drivers)
	{
		this.Drivers = drivers;
	}

	@XmlElementWrapper
    @XmlElement(name="bus")
	@WebMethod
	public @WebResult(name="bus") List<Bus> getBuses()
	{
		return Buses;
	}

	@WebMethod
	public void setBuses(
			@WebParam(name="buses") List<Bus> buses)
	{
		this.Buses = buses;
	}
	
	@WebMethod
	public @WebResult(name="database") DataBase getDatabaseContents()
	{
		return this;
	}
	
	@WebMethod
	public @WebResult(name="stop") BusStop findStopById(
			@WebParam(name="stopID") int id)
	{
		for(BusStop bs : Stops)
		{
			if(bs.getId() == id) return bs;
		}
		return null;
	}
	
	@WebMethod
	public @WebResult(name="line") Line findLineById(
			@WebParam(name="lineID") int id)
	{
		for(Line l : Lines)
		{
			if(l.getId() == id) return l;
		}
		return null;
	}
	
	@WebMethod
	public @WebResult(name="driver") Driver findDriverById(
			@WebParam(name="driverID") int id)
	{
		for(Driver d : Drivers)
		{
			if(d.getId() == id) return d;
		}
		return null;
	}
	
	@WebMethod
	public @WebResult(name="bus") Bus findBusById(
			@WebParam(name="busID") int id)
	{
		for(Bus b : Buses)
		{
			if(b.getId() == id) return b;
		}
		return null;
	}
	
	
	@WebMethod
	public @WebResult(name="runID") int createRun(
			@WebParam(name="driverID")      int driverId,
			@WebParam(name="busID")         int busId,
			@WebParam(name="lineID")        int lineId,
			@WebParam(name="isDirectionAB") boolean direction) throws Exception
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
	public @WebResult(name="incremented") boolean incrementRunStop(
			@WebParam(name="runID") int runId) throws Exception
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
	public @WebResult(name="results") List<BusStopSearchResult> getStopResults(
			@WebParam(name="stopID") int stopId) throws Exception
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
