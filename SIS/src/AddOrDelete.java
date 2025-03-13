import java.util.Scanner;

public class AddOrDelete
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				String defaultGrade = "[--]";
				String defaultGPA = "0.0";

				System.out.print("Student Name: ");
				String firstName = userInput.nextLine();

				System.out.print("Student Last Name: ");
				String lastName = userInput.nextLine();

				System.out.print("Period 1 Class: ");
				String periodOneClass = userInput.nextLine();

				System.out.print("Period 2 Class: ");
				String periodTwoClass = userInput.nextLine();

				System.out.print("Period 3 Class: ");
				String periodThreeClass = userInput.nextLine();

				String[] newStudent = {firstName, lastName, periodOneClass, defaultGrade, periodTwoClass, defaultGrade, periodThreeClass, defaultGrade, defaultGPA};
				System.out.println("Student Succesfully Added: " + firstName + " " + lastName + " " + periodOneClass + " " + periodTwoClass + " " + periodTwoClass);

				// GPA default = 0
				// Grade default = "[--]"
			}

		public void addStudent()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.print("Student Name: ");
				System.out.println(userInput);
				// declare a scanner variable for student name and instantiate to whatever the
				// user inputs
				// need first name, last name, GPA (this will need to be calculated), and three
				// courses which include the period, class name and current letter grade.
				// adds a student
			}

		public void deleteStudent()
			{
				Scanner userInput = new Scanner(System.in);

				System.out.print("Student Name: ");
				String firstName = userInput.nextLine();

				System.out.print("Student Last Name: ");
				String lastName = userInput.nextLine();

			}
	}
