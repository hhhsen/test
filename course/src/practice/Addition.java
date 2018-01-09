package practice;

public class Addition {
	public int add(int x,int y){
		int z = x + y;
		return z; 
	}
	public long add(long x,long y){
		long z = x + y;
		return z; 
	}
	public float add(float x,float y){
		float z = x + y;
		return z; 
	}
	public double add(double x,double y){
		double z = x + y;
		return z; 
	}
	public int add(String x,String y){
		int z = Integer.parseInt(x) + Integer.parseInt(y);
		return z; 
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		System.out.println(a.add(5, 3));
		System.out.println(a.add(5000000, 50000000));
		System.out.println(a.add(5.3, 5.5));
		System.out.println(a.add(5.33333, 5.555555));
		System.out.println(a.add("5", "3"));
	}

}