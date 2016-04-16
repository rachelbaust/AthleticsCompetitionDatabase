public class Entry
{
	private double expectedPerformance;
	private double result;
	private Entrant entrant;
	private Event event;
	
	Entry()
	{
		expectedPerformance = 0.0;
		result = 0.0;
		entrant = new Entrant();
		event = new Event();
	}
	
	Entry(Event eventObject, double predictedPerf, Entrant athlete)
	{
		expectedPerformance = predictedPerf;
		result = 0.0;
		entrant = athlete;
		event = eventObject;
	}
	
	void setExpectedPerformance(double performance)
	{
		expectedPerformance = performance;
	}
	
	void setResult(double performance)
	{
		result = performance;
	}
	
	void setEntrant(Entrant athlete)
	{
		entrant = athlete;
	}
	
	void setEvent(Event eventObject)
	{
		event = eventObject;
	}
	
	String showEntry()
	{
		return "Athlete number: "+ entrant.showNumber() + "\nName: " + entrant.showName() + "\nClub: "+ entrant.showClub() +
			   "\nEvent: "+ event.showEvent() + "\nExpected performance: "+ expectedPerformance;
	}
	
	String showResult()
	{
		return "Athlete number: "+ entrant.showNumber() + "\nName: " + entrant.showName() + "\nClub: "+ entrant.showClub() +
			   "\nEvent: "+ event.showEvent() + "\nResult: "+ result;
	}
}