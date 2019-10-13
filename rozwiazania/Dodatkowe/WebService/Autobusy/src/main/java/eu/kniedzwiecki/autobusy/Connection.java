package eu.kniedzwiecki.autobusy;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "connection")
public class Connection
{
	public Connection() { }
	
    public Connection(int A, int B, int timeAB, int timeBA)
    {
        this.A = A;
        this.B = B;
        this.TimeAB = timeAB;
        this.TimeBA = timeBA;
    }

    private int A;
    private int B;
    private int TimeAB;
    private int TimeBA;

	@XmlAttribute
	public int getA()
	{
		return A;
	}

	public void setA(int A)
	{
		this.A = A;
	}

	@XmlAttribute
	public int getB()
	{
		return B;
	}

	public void setB(int B)
	{
		this.B = B;
	}

	@XmlAttribute
	public int getTimeAB()
	{
		return TimeAB;
	}

	public void setTimeAB(int timeAB)
	{
		this.TimeAB = timeAB;
	}

	@XmlAttribute
	public int getTimeBA()
	{
		return TimeBA;
	}

	public void setTimeBA(int timeBA)
	{
		this.TimeBA = timeBA;
	}
}
