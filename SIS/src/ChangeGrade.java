import java.util.Scanner;
import java.util.ArrayList;

public class ChangeGrade 
{
	//hey, I'm going to work on this one- Rose
	
	static Scanner userInput = new Scanner(System.in);
	
	
	public static void changeGrade()
	{
		System.out.println("Whose grade would you like to change? Please type in the student's number:");
		int selectedStudent = userInput.nextInt() +1;
		
		ProjectRunner.studentList.get(selectedStudent);
		
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName() + "'s grades are: ");
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass1() +" : "+ ProjectRunner.studentList.get(selectedStudent).getClassGrade1());
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass2() +" : "+ ProjectRunner.studentList.get(selectedStudent).getClassGrade2());
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass3() +" : "+ ProjectRunner.studentList.get(selectedStudent).getClassGrade3());

		System.out.println("Which class grade would you like to change (class 1, 2, or 3)?");
		
		int selectedClass = userInput.nextInt();
		
		if (selectedClass == 1)
		{
			
		}
		
		else if (selectedClass == 2)
		{
			
		}
		
		else if (selectedClass == 3)
		{
			
		}
		
		else
		{
			System.out.println("Please enter either a 1, 2, or 3.");
		}
		
		
		
	}
	
	public static void switchClass()
	{
		
	}
	
	
	

}
