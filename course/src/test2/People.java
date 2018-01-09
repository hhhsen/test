package test2;

public class People {
		private String name;
		private int age;
		private String sex;
		private int high;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getHigh() {
			return high;
		}
		public void setHigh(int high) {
			this.high = high;
		}
		public void talk(){
			System.out.println("你好！");
		}
		public People(String name,String sex,int age,int high){
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.high = high;
		}
		public People(int age){
			this.age = age;
		}
		
	public static void main(String[] args) {
		People x = new People("张三","男",18,180);
		x.talk();
		System.out.println(x.getName()+" "+x.getSex()+" "+x.getAge()+" "+x.getHigh());
		System.out.println(23+45);
		x.setName("李四");
		System.out.println(x.getName()+" "+x.getSex()+" "+x.getAge()+" "+x.getHigh());
	}

}
