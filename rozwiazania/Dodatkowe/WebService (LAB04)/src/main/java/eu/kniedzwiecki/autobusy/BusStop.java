package eu.kniedzwiecki.autobusy;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "stop")
public class BusStop
{
	BusStop() { }
	
    public BusStop(int Id, String name, boolean onDemand)
    {
		this.Id = Id;
        this.Name = name;
        this.OnDemand = onDemand;
    }

    private int Id;
    private boolean OnDemand;
    private String Name;

	@XmlAttribute
	public int getId()
	{
		return Id;
	}

	public void setId(int Id)
	{
		this.Id = Id;
	}

	public boolean isOnDemand()
	{
		return OnDemand;
	}

	public void setOnDemand(boolean onDemand)
	{
		this.OnDemand = onDemand;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		this.Name = name;
	}
}