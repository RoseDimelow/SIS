import java.util.Scanner;

public class ProjectRunner 
{
	static String playerGuess = userInput.nextLine(); 
	public static void main(String[] args) 
	{
		//class.method
		System.out.println("");
		greetUser();
		addOrDelete();
		changeStudents();
		sortStudents();
		//Hey everyone! If you are reading this right now, I think that we should be up to date. 
		//I created a new class for each option of the first menu for the project
		//here are the jobs we agreed to do:
		//Aisley: work on the sort students menu option
		//Madeline: make the main menu- you might want to make your own class for this part instead of putting it all in the project runner class
		//Thanh-Tam: work on the add/delete option
		//Rose: create the pojo and import the text file
	}
	 public static void greetUser()
	 {
		Scanner userInput = new Scanner (System.in);
		System.out.println("Hello! I hope you have had a splendid day!");
		 playerGuess = userInput.nextLine(); 
		System.out.println("What would you like to do?");
		System.out.println("a) add or delete a student");
		System.out.println("b) change student grades/schedule");
		System.out.println("c) sort students");
	    playerGuess = userInput.nextLine(); 
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
		 
	 }
	

}
