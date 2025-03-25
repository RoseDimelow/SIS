
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ProjectRunner 
{
	static ArrayList <Student> studentList = new ArrayList <Student>();
	
	public static void main(String[] args) 
	{

		//class.method
		//System.out.println("");
		greetUser();
		addOrDelete();
		changeStudents();
		sortStudents();
		readTextFile();
		

		
	}

	 public static void greetUser()
	 {
		Scanner userInput = new Scanner (System.in);
		System.out.println("Hello! I hope you have had a splendid day!");
		System.out.println("What would you like to do?");
		System.out.println("a) add or delete a student");
		System.out.println("b) change student grades/schedule");
		System.out.println("c) sort students");
	    String playerGuess = userInput.nextLine(); 
	    if(playerGuess.equals("a") || playerGuess.equals("a)"))
	    	{
	    		addOrDelete();
	    	}
	    if(playerGuess.equals("b") || playerGuess.equals("b)"))
	    	{
	    		changeStudents();
	    	}
	    if(playerGuess.equals("c") || playerGuess.equals("c)"))
	    	{
	    		sortStudents();
	    	}
	    // sayas a b or c 
//		What would you like to do?
//		add or delete a student - need add/delete methods and classes
//		addStudent()
//		deleteStudent()
//		change student grades/schedule - need a class & methods
//		changeStudentGrades()
//		changeStudentSchedule()
//		sort students - need a class & methods
//		sortStudents()

	 }
	 public static void addOrDelete()
	 {
		
	 }
	 public static void changeStudents()
	 {
		 
	 }
	 public static void sortStudents()
	 {
		 SortStudents.sortLastName();
	 }
	
	
	
	public static void readTextFile()
	{
		try
		{
		Scanner myFile = new Scanner (new File("studentList.txt"));
		
		
		
		while (myFile.hasNext())
		{
			studentList.add(new Student (myFile.next(), myFile.next()));
		}
		
		for (Student s : studentList)
		{
			System.out.print(s.getFirstName() + " ");
			System.out.println(s.getLastName());
//			System.out.println(s.getGpa());

		}
		
		}
		
		catch (IOException ex)
		{
			System.out.println("Sorry, an error occurred.");
		}
	}


}
