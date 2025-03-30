
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class ProjectRunner 
{

	static ArrayList <Student> studentList = new ArrayList <Student>();

	
	public static void main(String[] args) throws FileNotFoundException 
	{
		readTextFile();
		calculateGpa();
		greetUser();
//		addOrDelete();
//		changeStudents();
//		sortStudents();
//		readTextFile();	
	}
	 public static void greetUser() throws FileNotFoundException
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

	 }
	 
	 public static void addOrDelete() throws FileNotFoundException
	 {
		Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to: ");
        System.out.println("1) Add a student");
        System.out.println("2) Delete a student");

        String choice = userInput.nextLine();
        
        if (choice.equals("1"))
        {
            AddOrDelete.addStudent();
        }
        if (choice.equals("2"))
        {
        	AddOrDelete.deleteStudent();
        }
	 
		       
	 }
	
	 public static void changeStudents()
	 {
		Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to: ");
        System.out.println("1) Change a student's grade");
        System.out.println("2) Switch a student's class");
        
        String choice1 = userInput.nextLine();
        
        if (choice1.equals("1"))
        {
            ChangeGrade.changeGrade();
            
        }
        if (choice1.equals("2"))
        {
        	 ChangeGrade.switchClass();
            
        }
	 }
	 
	 public static void sortStudents()
	 {
		Scanner userInput = new Scanner(System.in);
        System.out.println("How would you like to organize the students?");
        System.out.println("1) Sort by Last Name");
        System.out.println("2) Sort by GPA");
        System.out.println("3) Sort by Period");
        
        String choice2 = userInput.nextLine();
        
        if (choice2.equals("1"))
        {
            SortStudents.sortLastName();
        }
        if (choice2.equals("2"))
        {
            SortStudents.sortGPA();
        }
        if (choice2.equals("3"))
        {
            SortStudents.sortPeriod();
        }
 }
	
	 public static void readTextFile()
	{
		try
		{
		Scanner myFile = new Scanner (new File("studentList.txt"));
		
		
		
		while (myFile.hasNext())
		{
			studentList.add(new Student (myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), 0.0));
		}
		
		for (Student s : studentList)
		{
//			System.out.print(s.getFirstName() + " ");
//			System.out.println(s.getLastName() + " ");
//			System.out.println(s.getClass1() + " ");
//			System.out.println(s.getClassGrade1() + " ");
//			System.out.println(s.getClass2() + " ");
//			System.out.println(s.getClassGrade1() + " ");
//			System.out.println(s.getClass3() + " ");
//			System.out.println(s.getClassGrade3() + " ");

//			System.out.println(s.getGpa());

		}
		
		}
		
		catch (IOException ex)
		{
			System.out.println("Sorry, an error occurred.");
		}
		
		calculateGpa();
	}
	
	//calculate the student's GPA
	 public static void calculateGpa()
	{
	
		for (int i = 0; i < studentList.size(); i++)
		{
			String firstGrade = studentList.get(i).getClassGrade1();
			String secondGrade = studentList.get(i).getClassGrade2();
			String thirdGrade = studentList.get(i).getClassGrade3();
			
			double gPA = 0.0;
			
			//P1
			if(firstGrade.contains("A"))
			{
				gPA = gPA + 4.0;
			}
			
			else if (firstGrade.contains("B"))
			{
				gPA = gPA + 3.0;

			}
			
			else if (firstGrade.contains("C"))
			{
				gPA = gPA + 2.0;

			}
			
			else if (firstGrade.contains("D"))
			{
				gPA = gPA + 1.0;

			}
			
			//P2
			if(secondGrade.contains("A"))
			{
				gPA = gPA + 4.0;
			}
			
			else if (secondGrade.contains("B"))
			{
				gPA = gPA + 3.0;

			}
			
			else if (secondGrade.contains("C"))
			{
				gPA = gPA + 2.0;

			}
			
			else if (secondGrade.contains("D"))
			{
				gPA = gPA + 1.0;

			}
			
			//P3
			if(thirdGrade.contains("A"))
			{
				gPA = gPA + 4.0;
			}
			
			else if (thirdGrade.contains("B"))
			{
				gPA = gPA + 3.0;

			}
			
			else if (thirdGrade.contains("C"))
			{
				gPA = gPA + 2.0;

			}
			
			else if (thirdGrade.contains("D"))
			{
				gPA = gPA + 1.0;

			}
			
			gPA = gPA/3.0;
			gPA = (int) (gPA * 10) / 10.0;
			
			//System.out.println(gPA);
			
			studentList.get(i).setGpa(gPA);
			
			//System.out.println(studentList.get(i).getGpa());

		}
	}


}
