package inherit;

public class ManKind {
	protected int sex;
	protected int salary;
	
	public void manOrWoman()
	{
		if (sex == 1)
		{
			System.out.println("man");
		}
		else
		{
			System.out.println("women");
		}
	}	
	protected void employed()
	{
		if (salary == 0)
		{
			System.out.println("no job");
		}
		else
		{
			System.out.println("job");
		}
	}	
	
}
