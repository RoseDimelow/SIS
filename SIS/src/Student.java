
public class Student
	{
		private String firstName;
		private String lastName;
		private String class1;
		private String classGrade1;
		private String class2;
		private String classGrade2;
		private String class3;
		private String classGrade3;
		private double gpa;

		// add class periods

//	public Student(String f, String l, double g)
		public Student(String f, String l, String c1, String cg1, String c2, String cg2, String c3, String cg3,
				double g) // constructor
			{
				firstName = f;
				lastName = l;
				class1 = c1;
				classGrade1 = cg1;
				class2 = c2;
				classGrade2 = cg2;
				class3 = c3;
				classGrade3 = cg3;
				gpa = g;

			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName()
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName()
			{
				this.lastName = lastName;
			}

		public String getClass1()
			{
				return class1;
			}

		public void setClass1(String class1)
			{
				this.class1 = class1;
			}

		public String getClassGrade1()
			{
				return classGrade1;
			}

		public void setClassGrade1(String classGrade1)
			{
				this.classGrade1 = classGrade1;
			}

		public String getClass2()
			{
				return class2;
			}

		public void setClass2(String class2)
			{
				this.class2 = class2;
			}

		public String getClassGrade2()
			{
				return classGrade2;
			}

		public void setClassGrade2(String classGrade2)
			{
				this.classGrade2 = classGrade2;
			}

		public String getClass3()
			{
				return class3;
			}

		public void setClass3(String class3)
			{
				this.class3 = class3;
			}

		public String getClassGrade3()
			{
				return classGrade3;
			}

		public void setClassGrade3(String classGrade3)
			{
				this.classGrade3 = classGrade3;
			}

		public double getGpa()
			{
				return gpa;
			}

		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}

	}
