package eu.kniedzwiecki.autobusy;

class BusStopSearchResult
	{
		public String Line;
		public String Destination;
		public int ArrivesIn;
		
		private final String pad1 = "    ";
		private final String pad2 = "                  ";
		
		@Override
		public String toString()
		{
			return Line 
					+ pad1.substring(Line.length()) 
					+ Destination 
					+ pad2.substring(Destination.length()) 
					+ Integer.toString(ArrivesIn) 
					+ " min";
		}
	}
	