package machh;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Machhh {

	public static void main(String[] args) {
		double a = 3981.8973;
		NumberFormat nf = new DecimalFormat("###,000.0000");
		System.out.println(nf.format(a));
		nf = new DecimalFormat("###,000,000.0000");
		System.out.println(nf.format(a));
		nf = new DecimalFormat("00.00%");
		double b = 0.6897;
		System.out.println(nf.format(b));
	}

}
