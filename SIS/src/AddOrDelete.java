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
				String firstName = userInput.nextLine(); // Student parameter

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

				ArrayList<Student> studentList = new ArrayList<Student>();

				studentList.add(student);

				System.out.println("Student Succesfully Added: " + firstName + " " + lastName + " First Period Class: " + periodOneClass
						+ " Grade: " + defaultGrade + " Second Period Class: " + periodTwoClass + " " + defaultGrade + " Third Period Class: " + periodThreeClass + " Grade: "
						+ defaultGrade + " GPA: " + defaultGPA);

				Scanner myFile = new Scanner(new File("studentList.txt"));

				while (myFile.hasNext())
					{
						studentList.add(new Student(myFile.next(), myFile.next(), myFile.next(), myFile.next(),
								myFile.next(), myFile.next(), myFile.next(), myFile.next(), 0.0));
					}

			}

		public static void deleteStudent()  throws FileNotFoundException

			{
				Scanner userInput = new Scanner(System.in);

				System.out.print("Student First Name: ");
				String firstName = userInput.nextLine();

				System.out.print("Student Last Name: ");
				String lastName = userInput.nextLine();


				ArrayList<Student> studentList = new ArrayList<Student>();

				Scanner myFile = new Scanner(new File("studentList.txt"));

				while (myFile.hasNext())
					{
						studentList.add(new Student(myFile.next(), myFile.next(), myFile.next(), myFile.next(),
								myFile.next(), myFile.next(), myFile.next(), myFile.next(), 0.0));
					}

				for (int i = 0; i < studentList.size(); i++)
					{
						if (studentList.get(i).getFirstName().equals(firstName)
								&& studentList.get(i).getLastName().equals(lastName))
							{
								studentList.remove(studentList.get(i));
							}
					}

				System.out.println(firstName + " " + lastName + " successfully removed.");

			}

	}
