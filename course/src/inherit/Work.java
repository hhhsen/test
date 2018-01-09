package inherit;

public class Work extends Company{
	 public Work(String name,String part)
	{
		super(name,part);		
	}
	  
	  public static void main(String[] args)
		{
			Work a = new Work("清洁工", "清洁");
			a.introduce();
			Company b = new Company("经理","谈生意");
			b.introduce();
		}

}
