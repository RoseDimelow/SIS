import java.util.Comparator;

public class CompareEnglish implements Comparator<Student>
	{

	@Override
	public int compare(Student o1, Student o2)
		{
			int name = o1.getLastName().compareTo(o2.getLastName());
			int period = o1.getClass3().compareTo(o2.getClass3());
			
			if (period == 0)
				{
					return name;
				}
			
			else
				{
					return period;
				}
		}

	}
