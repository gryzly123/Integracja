package eu.kniedzwiecki.autobusy;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "driver")
public class Driver
{
	public Driver() { }
	
    public Driver(int Id, String firstName, String lastName)
    {
        this.Id = Id;
        this.FirstName = firstName;
        this.LastName = lastName;
    }
	private int Id;
	private String FirstName;
	private String LastName;

	@XmlAttribute
	public int getId()
	{
		return Id;
	}

	public void setId(int Id)
	{
		this.Id = Id;
	}

	public String getFirstName()
	{
		return FirstName;
	}

	public void setFirstName(String firstName)
	{
		this.FirstName = firstName;
	}

	public String getLastName()
	{
		return LastName;
	}

	public void setLastName(String lastName)
	{
		this.LastName = lastName;
	}
}