
// editPlus中蓝色是关键字
// 黑色是标识符
// System.out.println("Hello World!"); 
// 以上代码中：System、out、println都是标识符。
// 在 editplus中的红色字体，表示这个类是SUN的JDK写好的一个类。
public class Test{

	// 静态变量
	static Student stu = new Student();

	// 入口
	public static void main(String[] args){
		
		//拆分为两行
		Student s = Test.stu;
		s.exam();

		//合并代码
		Test.stu.exam();

		System.out.println("Hello World!");
	}
}

class Student{

	// 实例方法
	public void exam(){
		System.out.println("考试。。。。。");
	}
}