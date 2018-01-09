package note;

public class MobilePhone extends Phone{

	@Override
	String getPhoneNo() {
		return "a";
	}
	@Deprecated
	void say(String name){
		System.out.println("11111");
	}

}
