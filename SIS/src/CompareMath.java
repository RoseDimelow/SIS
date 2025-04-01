import java.util.Comparator;

public class CompareMath implements Comparator<Student>
	{

	@Override
	public int compare(Student o1, Student o2)
		{
			int name = o1.getLastName().compareTo(o2.getLastName());
			int period = o1.getClass1().compareTo(o2.getClass1());
			
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
