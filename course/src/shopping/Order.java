package shopping;

import java.io.Serializable;

public class Order  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3778475829756732337L;
	private String productName;
	private double price;
	private int num;
	
	public Order(String productName, double price, int num) {
		super();
		this.productName = productName;
		this.price = price;
		this.num = num;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	Order(){
		
	}
}
