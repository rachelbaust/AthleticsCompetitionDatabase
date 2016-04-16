import java.time.*;
import java.time.format.*;

public class Event
{
	private String eventName;
	private LocalDateTime eventDateTime;
	
	Event()
	{
		eventName = "";
		eventDateTime = LocalDateTime.now();
	}
	
	Event(String name, String date)
	{
		eventName = name;
		setEventDateTime(date);
	}

	void setEvent(String name)
	{
		eventName = name;
	}
	
	String showEvent()
	{
		return eventName;
	}
	
	void setEventDateTime(String date)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM uuuu h:m a");
		eventDateTime = LocalDateTime.parse(date, formatter);
	}
	
	String showEventDateTime()
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM uuuu h:m a");
		String date = eventDateTime.format(formatter);
		return date;
	}
	
	String showEventDate()
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM uuuu");
		LocalDate date = eventDateTime.toLocalDate();
		String eventDate = date.format(formatter);
		return eventDate;
	}
	
	String showEventTime()
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:m a");
		LocalTime time = eventDateTime.toLocalTime();
		String eventTime = time.format(formatter);
		return eventTime;
	}
}
