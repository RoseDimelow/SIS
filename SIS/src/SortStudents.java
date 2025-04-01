import java.util.Scanner;

import java.util.Collections;


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
		Collections.sort(ProjectRunner.studentList, new CompareLastName());
		
		for (Student s : ProjectRunner.studentList)
			{
				System.out.println(s.getFirstName() + " " + s.getLastName());
			}

	}
	
	public static void sortGPA()
	{
Collections.sort(ProjectRunner.studentList, new CompareGPA());
		
		for (Student g : ProjectRunner.studentList)
			{
				System.out.println(g.getFirstName() + " " + g.getLastName() + " " + g.getGpa());
			}
		
	}
	
	public static void sortPeriod()
	{
		Scanner userIntInput = new Scanner(System.in);
		
		System.out.println("What period do you want to sort by?");
		System.out.println("1. Algebra");
		System.out.println("2. Biology");
		System.out.println("3. English");
		
		int answer1 = userIntInput.nextInt();
		
		if (answer1 == 1 || answer1 == 1.)
			{
				sortMath();
			}
		
		else if (answer1 == 2 || answer1 == 2.)
			{
				sortScience();
			}
		
		else
			{
				sortEnglish();
			}
	}
	
	public static void sortMath()
	{
		Collections.sort(ProjectRunner.studentList, new CompareMath());
		
		for (Student m : ProjectRunner.studentList)
			
			{
				System.out.println(m.getFirstName() + " " + m.getLastName() + " " + m.getClass1());
			}
			
	}
	
	public static void sortScience()
	{
		Collections.sort(ProjectRunner.studentList, new CompareScience());
			
		for (Student b : ProjectRunner.studentList)
			{
				System.out.println(b.getFirstName() + " " + b.getLastName() + " " + b.getClass2());
			}
	}
	
	public static void sortEnglish()
	
	{
		Collections.sort(ProjectRunner.studentList, new CompareEnglish());
		
		for (Student e : ProjectRunner.studentList)
			{
				System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getClass3());
			}
	}
}
