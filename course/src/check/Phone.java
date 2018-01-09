package check;

public class Phone {

	public static void main(String[] args) {
		String p = "13345678910";
		System.out.println("判断是否为手机号：" + p.matches("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$"));
		String e = "1235zsdf@qer.com";
		System.out.println("判断是否为邮箱:" + 
		e.matches("^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"));

	}

}
