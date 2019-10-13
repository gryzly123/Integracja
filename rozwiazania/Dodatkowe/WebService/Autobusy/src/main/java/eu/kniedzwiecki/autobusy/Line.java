package eu.kniedzwiecki.autobusy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "line")
public class Line
{
	public Line() { }
	
    public Line(int Id, String name)
    {
        this.Id = Id;
        this.Name = name;
		this.Stops = new ArrayList<>();
    }
	
/*	public void dodajPrzystanek(int Id) throws Exception
	{
		for(Connection i : Stops)
			if(i == Id)
				throw new Exception();
		Stops.add(Id);
	}
*/	
    private int Id;
    private String Name;
    private List<Connection> Stops;

	@XmlAttribute
	public int getId()
	{
		return Id;
	}

	public void setId(int Id)
	{
		this.Id = Id;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		this.Name = name;
	}

	@XmlElementWrapper
    @XmlElement(name="connection")
	public List<Connection> getStops()
	{
		return Stops;
	}

	public void setStops(List<Connection> stops)
	{
		this.Stops = stops;
	}
	
	public int drivesThroughStop(BusStop s)
	{
		int id = 0;
		for(Connection c : Stops)
		{
			if(s.getId() == c.getB()) return id;
			++id;
		}
		return -1;
	}
}
