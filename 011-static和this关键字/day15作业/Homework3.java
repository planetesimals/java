/*
(封装)已知一个类 Student 代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
要求：
	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的"地址"和"邮编"。
	注意：这里所说的地址是：address，不是内存地址。
*/
public class Homework3{
	public static void main(String[] args){

		Student s1 = new Student();
		System.out.println(s1.getName() + "，" + s1.getPostAddress());

		// 赋值
		s1.setName("zhangsan");
		s1.setAge(20);
		s1.setAddress("北京朝阳区");
		s1.setZipcode("122222");
		s1.setMobile("12235224214");

		System.out.println(s1.getName() + "，" + s1.getPostAddress());

		Student s2 = new Student("李四",18,"深圳宝安区","11111","456456456456465");
		System.out.println(s2.getName() + "，" + s2.getPostAddress());

	}
}

class Student{
	private String name;
	private int age;
	private String address;
	private String zipcode;
	private String mobile;

	public Student(){
	
	}
	public Student(String name, int age, String address, String zipcode, String mobile){
		this.name = name;
		this.age = age;
		this.address = address;
		this.zipcode = zipcode;
		this.mobile = mobile;
	}

	// 返回地址和邮编
	public String getPostAddress(){
		return "地址：" + this.getAddress() + "，邮编：" + this.getZipcode();
		//return "地址：" + this.address + "，邮编：" + this.zipcode;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	public String getZipcode(){
		return zipcode;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return mobile;
	}

}