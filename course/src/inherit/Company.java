package inherit;

public class Company {
	private String name;
	private String part;
	private int salary;
	public Company(String name, String part) {
		this.name = name;
		this.part = part;
	}
	public Company(){}
	
	public void introduce()
	{
		System.out.println(name + "要" + part);
	
	}

}
