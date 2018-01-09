package enum1;

public enum Colors2 {
	BLUE("蓝色","#0000FF");
	private String name;
	private String code;
	private Colors2(String name,String code){
		this.name = name;
		this.code = code;
	}
	public String getName(){
		return name;
	}
	public String getCode(){
		return code;
	}
}
