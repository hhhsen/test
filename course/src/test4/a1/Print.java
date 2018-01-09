package test4.a1;

public class Print implements InterfaceA,InterfaceB{

	@Override
	public void printCapitalLetter(int a) {
		for(char aa = 'A'; aa<='Z';aa++){
			System.out.print(aa + " ");
		}
		System.out.println();
		System.out.println(a);
	}
	

	@Override
	public void printLowercaseLetter(int b) {
		for(char aa = 'a'; aa<='z';aa++){
			System.out.print(aa + " ");
		}
		System.out.println();
		System.out.println(b);
	}

	

}
