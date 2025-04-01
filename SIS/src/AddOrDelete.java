import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddOrDelete
	{

		public static void addStudent() throws FileNotFoundException
			{
				Scanner userInput = new Scanner(System.in);
				String defaultGrade = "[--]";
				double defaultGPA = 0.0;

				System.out.print("Student First Name: ");
				String firstName = userInput.nextLine();

				System.out.print("Student Last Name: ");
				String lastName = userInput.nextLine();

				System.out.print("Period 1 Class: ");
				String periodOneClass = userInput.nextLine();

				System.out.print("Period 2 Class: ");
				String periodTwoClass = userInput.nextLine();

				System.out.print("Period 3 Class: ");
				String periodThreeClass = userInput.nextLine();

				Student student = new Student(firstName, lastName, periodOneClass, defaultGrade, periodTwoClass,
						defaultGrade, periodThreeClass, defaultGrade, defaultGPA);

				ProjectRunner.studentList.add(student);

				System.out.println("\nStudent Succesfully Added: " + firstName + " " + lastName + " " + periodOneClass
						+ " " + defaultGrade + " " + periodTwoClass + " " + defaultGrade + " " + periodThreeClass + " "
						+ defaultGrade + " " + defaultGPA + "\n");

				// ProjectRunner.readTextFile();
				// ProjectRunner.printList();

			}

		public static void deleteStudent() throws FileNotFoundException

			{
				Scanner userInput = new Scanner(System.in);

				System.out.println("Which student would you like to delete?\n");
				ProjectRunner.readTextFile();
				ProjectRunner.printList();

				int studentToBeDeleted = userInput.nextInt();

				String deletedStudentFirstName = ProjectRunner.studentList.get(studentToBeDeleted - 1).getFirstName();
				String deletedStudentLastName = ProjectRunner.studentList.get(studentToBeDeleted - 1).getLastName();

				ProjectRunner.studentList.remove(ProjectRunner.studentList.get(studentToBeDeleted - 1));

				// ProjectRunner.printList();
				System.out.println(deletedStudentFirstName + " " + deletedStudentLastName + " successfully removed.");

			}

	}
