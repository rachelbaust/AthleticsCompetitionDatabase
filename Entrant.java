public class Entrant
{
	private String firstName;
	private String lastName;
	private char gender;
	private String ageGroup;
	private int number;
	private String club;
	private String address;
	private String telephone;
	private String email;
	
	Entrant()
	{
		firstName = "";
		lastName = "";
		gender = '\0';
		ageGroup = "";
		number = 0;
		club = "";
		address = "";
		telephone = "";
		email = "";
	}

	Entrant(String first_name, String last_name, char gen, String age, int num)
	{
		firstName = first_name;
		lastName = last_name;
		gender = gen;
		ageGroup = age;
		number = num;
	}
	
	Entrant(String first_name, String last_name, char gen, String age, int num, String affiliation, String addr, String tel, String em)
	{
		firstName = first_name;
		lastName = last_name;
		gender = gen;
		ageGroup = age;
		number = num;
		club = affiliation;
		address = addr;
		telephone = tel;
		email = em;
	}
	
	void setFirstName(String first_name)
	{
			firstName = first_name;
	}

	void setLastName(String last_name)
	{
			lastName = last_name;
	}
	
	void setGender(char gen)
	{
		gender = gen;
	}
	
	void setAgeGroup(String age)
	{
		ageGroup = age;
	}
	
	void allocateNumber(int num)
	{
		number = num;
	}
	
	void setClub(String affiliation)
	{
		club = affiliation;
	}
	
	void setAddress(String addr)
	{
		address = addr;
	}
	
	void setTelephone(String tel)
	{
		telephone = tel;
	}

	void setEmail(String em)
	{
		email = em;
	}	
	
	String showName()
	{
		return firstName + " " + lastName;
	}
	
	char showGender()
	{
		return gender;
	}
	
	String showAgeGroup()
	{
		return ageGroup;
	}
	
	int showNumber()
	{
		return number;
	}
	
	String showClub()
	{
		return club;
	}
	
	String showAddress()
	{
		return address;
	}
	
	String showTelephone()
	{
		return telephone;
	}

	String showEmail()
	{
		return email;
	}
	
	String showEntrant()
	{
		return "Name: "+firstName + " " + lastName + "\nGender: "+ gender +"\nAge group: "+ ageGroup + "\nAthlete number: "+ number +"\nClub: "+ club +
			   "\nAddress: "+ address +"\nTelephone: " + telephone +"\nEmail: " + email;
	}
}