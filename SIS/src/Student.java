
public class Student 
{
	private String firstName;
	private String lastName;
	private double gpa;
	//add class periods
	
	public Student(String f, String l, double g)
	{
		firstName = f;
		lastName = l; 
		gpa = g;
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName()
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName()
	{
		this.lastName = lastName;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setGpa()
	{
		this.gpa = gpa;
	}
}
