import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ProjectRunner 
{

	public static void main(String[] args) 
	{

		readTextFile();
		
		//Hey everyone! If you are reading this right now, I think that we should be up to date. 
		//I created a new class for each option of the first menu for the project
		//here are the jobs we agreed to do:
		//Aisley: work on the sort students menu option
		//Madeline: make the main menu- you might want to make your own class for this part instead of putting it all in the project runner class
		//Thanh-Tam: work on the add/delete option
		//Rose: create the pojo and import the text file
	}
	
	
	
	
	
	public static void readTextFile()
	{
		try
		{
		Scanner myFile = new Scanner (new File("studentList.txt"));
		
		ArrayList <Student> studentList = new ArrayList <Student>();
		
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
