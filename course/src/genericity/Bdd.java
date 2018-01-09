package genericity;

public class Bdd {
public <T> void list(T[] a){
	 for(T i : a){
		 System.out.println(i);
	 }
 }
	public static void main(String[] args) {
		new Bdd().list(new Double[]{2.2,3.3,4.4});
		new Bdd().list(new String[]{"aa","bb","cc"});
	}

}
