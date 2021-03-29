public class Student{

	// 学号
	int no;

	// 姓名
	String name;

	// 年龄
	int age;

	// 当前的Student这个类当中并没有定义任何构造方法。
	// 但是系统实际上会自动给Student类提供一个无参数的构造方法。
	// 将无参数的构造方法（缺省构造器）写出来
	public Student(){
		System.out.println("无参数的构造方法执行了！");
	}

	// 定义一个有参数的构造方法
	public Student(int i){
	
	}

	/*
		编译器检测到该方法名“Studen”，发现这个名字和类名不一致，
		编译器会认为该方法是一个普通方法，普通方法应该有返回值
		但是没有写返回值类型，所以报错了。
		 错误: 方法声明无效; 需要返回类型
	*/
	/*
	public Studen(String name){
	
	}
	*/

	// 第一种修改方式
	//public void Studen(String name){}

	// 第二种修改方式
	public Student(String name){
	
	}
}