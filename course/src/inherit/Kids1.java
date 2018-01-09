package inherit;

public class Kids1 extends ManKind{	
	
	private int yearsOld;
	
	public void printAge()
	{
		System.out.println(yearsOld);
	}
	public void employed()
	{		
		super.employed();
		System.out.println("but Kids should study and no job" );		
	}

	public static void main(String[] args) {
		Kids1 someKid = new Kids1();
		someKid.sex = 1;
		someKid.manOrWoman();
		someKid.salary = 1;
		someKid.employed();
		someKid.yearsOld = 5;
		someKid.printAge();

	}

}
