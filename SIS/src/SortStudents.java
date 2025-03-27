import java.util.Scanner;

public class SortStudents 
{	
	public static void questions()
	{
		Scanner userIntInput = new Scanner(System.in);
		
		System.out.println("How would you like to organize the students?");
		System.out.println("1. Last Name");
		System.out.println("2. GPA");
		System.out.println("3. Period");
		
		int answer = userIntInput.nextInt();
		
		if (answer == 1 || answer == 1.)
			{
				sortLastName();
			}
		
		else if (answer == 2 || answer == 2.)
			{
				sortGPA();
			}
		
		else
			{
				sortPeriod();
			}
	}
	
	public static void sortLastName()
	{
		
	}
	
	public static void sortGPA()
	{
		
	}
	
	public static void sortPeriod()
	{
		
	}
}
