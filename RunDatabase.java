public class RunDatabase
{
	public static void main(String[] args)
	{
		Entrant entrant1 = new Entrant("Test", "Entrant", 'F', "Sen", 181, "Test Club", "118 Test Street, Test City, Test Postcode", "00000 000000", "test@testEmail.com");
		//System.out.println(entrant1.showEntrant());
		Event event200 = new Event("200m Sen W", "16 April 2016 2:30 PM");
		Entry entry200 = new Entry(event200, 30.0, entrant1);
		System.out.println(entry200.showEntry());
		entry200.setResult(29.7);
		System.out.println("\n" + entry200.showResult());
		System.out.println("\n\n" + event200.showEventDateTime());
		System.out.println("\n\n" + event200.showEventDate());
		System.out.println("\n\n" + event200.showEventTime());
	}
}