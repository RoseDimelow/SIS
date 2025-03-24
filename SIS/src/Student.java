
public class Student 
{
	private String firstName;
	private String lastName;
	private double gpa;
//	private String class1;
//	private String classGrade1;
//	private String class2;
//	private String classGrade2;
//	private String class3;
//	private String classGrade3;
	
	//add class periods
	
//	public Student(String f, String l, double g)
	public Student(String f, String l)
	{
		firstName = f;
		lastName = l; 
//		gpa = g;
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
	
//	public double getGpa()
//	{
//		return gpa;
//	}
//	
//	public void setGpa()
//	{
//		this.gpa = gpa;
//	}
}
