import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddOrDelete
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				addStudent();
				deleteStudent();
			}

		public static void addStudent() throws FileNotFoundException
			{
				Scanner userInput = new Scanner(System.in);
				String defaultGrade = "[--]";
				double defaultGPA = 0.0;

				System.out.print("Student Name: ");
				String firstName = userInput.nextLine(); // Student parameter

				System.out.print("Student Last Name: ");
				String lastName = userInput.nextLine();

				System.out.print("Period 1 Class: ");
				String periodOneClass = userInput.nextLine();

				System.out.print("Period 2 Class: ");
				String periodTwoClass = userInput.nextLine();

				System.out.print("Period 3 Class: ");
				String periodThreeClass = userInput.nextLine();
				
				Student student = new Student(firstName, lastName, periodOneClass, defaultGrade, periodTwoClass, defaultGrade, periodThreeClass, defaultGrade, defaultGPA);
				
				ArrayList <Student> studentList = new ArrayList <Student>();
				
				studentList.add(student);
				
				System.out.println("Student Succesfully Added: " + firstName + " " + lastName + " " + periodOneClass
						+ " " + defaultGrade + " " + periodTwoClass + " " + defaultGrade + " " + periodThreeClass + " "
						+ defaultGrade + " " + defaultGPA);
				
				Scanner myFile = new Scanner(new File("studentList.txt"));
				
				while (myFile.hasNext())
					{
						studentList.add(new Student (myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), 0.0));
					}
				
				for (Student s : studentList)
					{
						System.out.print(s.getFirstName() + " ");
						System.out.print(s.getLastName() + " ");
						System.out.print(s.getClass1() + " ");
						System.out.print(s.getClassGrade1() + " ");
						System.out.print(s.getClass2() + " ");
						System.out.print(s.getClassGrade2() + " ");
						System.out.print(s.getClass3() + " ");
						System.out.print(s.getClassGrade3() + " ");
						System.out.println(s.getGpa());

					}
			}

		public static void deleteStudent()
			{
				Scanner userInput = new Scanner(System.in);

				System.out.print("Student Name: ");
				String firstName = userInput.nextLine();

				System.out.print("Student Last Name: ");
				String lastName = userInput.nextLine();

				//studentList.remove();
			}

	}
