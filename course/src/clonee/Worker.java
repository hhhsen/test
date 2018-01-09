package clonee;

public class Worker implements Cloneable{
	private int age;
	private String name;
	private String job;

	public Worker(int age, String name, String job) {
		super();
		this.age = age;
		this.name = name;
		this.job = job;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
