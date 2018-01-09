package collectio;

public class Emp {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Emp(int id) {
		super();
		this.id = id;
	}

	public Emp() {
		super();
	}
	public String toString(){
		return id+" ";
	}
}
