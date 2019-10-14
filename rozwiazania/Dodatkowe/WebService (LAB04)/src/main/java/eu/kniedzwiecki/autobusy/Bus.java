package eu.kniedzwiecki.autobusy;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "bus")
public class Bus
{
	public Bus() { }
	
    public Bus(int Id, String Brand, String Model)
    {
        this.Id = Id;
        this.Brand = Brand;
        this.Model = Model;
    }
    private int Id;
    private String Brand;
    private String Model;

	@XmlAttribute
	public int getId()
	{
		return Id;
	}

	public void setId(int Id)
	{
		this.Id = Id;
	}

	public String getBrand()
	{
		return Brand;
	}

	public void setBrand(String Marka)
	{
		this.Brand = Marka;
	}

	public String getModel()
	{
		return Model;
	}

	public void setModel(String Model)
	{
		this.Model = Model;
	}
}
