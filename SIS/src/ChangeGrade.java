import java.util.Scanner;
import java.util.ArrayList;

public class ChangeGrade 
{	
	static Scanner userInput = new Scanner(System.in);
	
	
	public static void changeGrade()
	{
		System.out.println();
		ProjectRunner.printList();
		System.out.println();

		System.out.println("Whose grade would you like to change? Please type in the student's number:");
		int selectedStudent = userInput.nextInt() -1;
		
		ProjectRunner.studentList.get(selectedStudent);
		
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName() + "'s grades are: ");
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass1() +" : "+ ProjectRunner.studentList.get(selectedStudent).getClassGrade1());
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass2() +" : "+ ProjectRunner.studentList.get(selectedStudent).getClassGrade2());
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass3() +" : "+ ProjectRunner.studentList.get(selectedStudent).getClassGrade3());

		System.out.println("Which class grade would you like to change (class 1, 2, or 3)?");
		
		int selectedClass = userInput.nextInt();
		
		if (selectedClass == 1)
		{
			System.out.println("What would you like to change the grade to?");
			Scanner userChoice = new Scanner (System.in);
			String newGrade = userChoice.nextLine();

			ProjectRunner.studentList.get(selectedStudent).setClassGrade1(newGrade);
			System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName()+"'s " + ProjectRunner.studentList.get(selectedStudent).getClass1() + " grade is now " + ProjectRunner.studentList.get(selectedStudent).getClassGrade1()+".");
		}
		
		else if (selectedClass == 2)
		{
			System.out.println("What would you like to change the grade to?");
			Scanner userChoice = new Scanner (System.in);
			String newGrade = userChoice.nextLine();
			
			ProjectRunner.studentList.get(selectedStudent).setClassGrade2(newGrade);
			System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName()+"'s " + ProjectRunner.studentList.get(selectedStudent).getClass2() + " grade is now "+ProjectRunner.studentList.get(selectedStudent).getClassGrade2()+".");
		}
		
		else if (selectedClass == 3)
		{
			System.out.println("What would you like to change the grade to?");
			Scanner userChoice = new Scanner (System.in);
			String newGrade = userChoice.nextLine();
			
			ProjectRunner.studentList.get(selectedStudent).setClassGrade3(newGrade);
			System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName()+"'s " + ProjectRunner.studentList.get(selectedStudent).getClass3() + " grade is now "+ProjectRunner.studentList.get(selectedStudent).getClassGrade3()+".");
		}
		
		else
		{
			System.out.println("Please enter either a 1, 2, or 3.");
		}
		
		ProjectRunner.calculateGpa();
	}
	
	public static void switchClass()
	{
		System.out.println();
		ProjectRunner.printList();
		System.out.println();
		
		System.out.println("Whose class would you like to change? Please type in the student's number:");
		int selectedStudent = userInput.nextInt() -1;
		
		ProjectRunner.studentList.get(selectedStudent);
		
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName() + "'s classes are: ");
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass1());
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass2());
		System.out.println(ProjectRunner.studentList.get(selectedStudent).getClass3());

		System.out.println("Which class would you like to change (class 1, 2, or 3)?");
		
		int selectedClass = userInput.nextInt();
		
		if (selectedClass == 1)
		{
			System.out.println("What would you like to change the class to?");
			Scanner userChoice = new Scanner (System.in);
			String newClass = userChoice.nextLine();

			ProjectRunner.studentList.get(selectedStudent).setClass1(newClass);
			System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName()+"'s first period class is now "+ProjectRunner.studentList.get(selectedStudent).getClass1()+".");
		}
		
		else if (selectedClass == 2)
		{
			System.out.println("What would you like to change the class to?");
			Scanner userChoice = new Scanner (System.in);
			String newClass = userChoice.nextLine();

			ProjectRunner.studentList.get(selectedStudent).setClass2(newClass);
			System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName()+"'s second period class is now "+ProjectRunner.studentList.get(selectedStudent).getClass2()+".");
		}
		
		else if (selectedClass == 3)
		{
			System.out.println("What would you like to change the class to?");
			Scanner userChoice = new Scanner (System.in);
			String newClass = userChoice.nextLine();

			ProjectRunner.studentList.get(selectedStudent).setClass3(newClass);
			System.out.println(ProjectRunner.studentList.get(selectedStudent).getFirstName()+"'s third period class is now "+ProjectRunner.studentList.get(selectedStudent).getClass3()+".");
		}
		
		else
		{
			System.out.println("Please enter either a 1, 2, or 3.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
