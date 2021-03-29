
//构造方法、构造器、Constructor【构造函数】
// 只能用new来调用构造方法。
public class Student{

	String no;
	String name;

	// 无参数的构造方法
	public Student(){
	}
	public Student(String s){
		no = s;
	}
	/*
	public Student(String mingZi){
		name = mingZi;
	}
	*/
	public Student(String s1, String s2){
		no = s1;
		name = s2;
	}
}

//构造方法两个作用：创建对象  给属性赋值。

class StudentTest{
	public static void main(String[] args){
		Student s = new Student();
		Student s1 = new Student("100");
	}
}