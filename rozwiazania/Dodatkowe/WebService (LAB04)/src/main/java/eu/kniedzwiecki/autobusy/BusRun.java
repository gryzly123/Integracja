package eu.kniedzwiecki.autobusy;

public class BusRun
{	
    public BusRun(Line KursLinii, Driver KierowcaKursu, Bus AutobusKursu, boolean Kierunek)
    {
        this.TargetLine = KursLinii;
        this.TargetDriver = KierowcaKursu;
        this.TargetBus = AutobusKursu;
		this.Direction = Kierunek;
		this.CurrentStop = Kierunek ? 0 : KursLinii.getStops().size() - 1;
    }

    private Line TargetLine;
    private Driver TargetDriver;
    private Bus TargetBus;
    private int CurrentStop;
	private boolean Direction; //true=A->B, false=B->A

	public Line getLine()
	{
		return TargetLine;
	}

	public Driver getDriver()
	{
		return TargetDriver;
	}

	public Bus getBus()
	{
		return TargetBus;
	}

	public int getCurrentStop()
	{
		return CurrentStop;
	}
	
	public enum incrementResult
	{
		INCREMENTED,
		FINISHED,
		FAIL
	};
	
	public incrementResult incrementStop()
	{
		if(Direction)
		{
			if(CurrentStop > TargetLine.getStops().size()) return incrementResult.FAIL;
			++CurrentStop;
			return (CurrentStop > TargetLine.getStops().size()) 
				? incrementResult.FINISHED 
				: incrementResult.INCREMENTED;
		}
		//else: !Direction
		
		if(CurrentStop < -1) return incrementResult.FAIL;
		--CurrentStop;
		return (CurrentStop < -1) 
				? incrementResult.FINISHED 
				: incrementResult.INCREMENTED;
	}

	public boolean isDirectionAB()
	{
		return Direction;
	}
	
}
