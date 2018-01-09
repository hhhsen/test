package clonee;

public class TestWorker {
	public static void main(String[] args){
		Worker w = new Worker(10,"张三","商人");
		try {
			Worker w1 = (Worker) w.clone();
			System.out.println(w.getAge()+w.getName()+w.getJob());
			System.out.println(w1.getAge()+w1.getName()+w1.getJob());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
