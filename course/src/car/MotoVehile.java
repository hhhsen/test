package car;

abstract class MotoVehile {
	private String no;
	private String brand;
	private String color;
	private int mileage;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public MotoVehile(String no,String brand){
		this.no = no;
		this.brand = brand;
	}	
	public MotoVehile(){}
	
	abstract int calcRent(int days);
	
	

}
