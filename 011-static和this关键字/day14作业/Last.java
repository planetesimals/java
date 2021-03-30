/*
定义丈夫类 Husband 和妻子类 Wife，
丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），
编写测试程序，创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，
妻子对象关联丈夫对象，要求能够输出这个“丈夫对象”的妻子的名字，
或者能够输出这个“妻子对象”的丈夫的名字。要求能够画出程序执行过程的内存图。
并且要求在程序中演示出空指针异常的效果。

别懵：
	.后面只是一个单词，没有小括号，表示访问的是属性。
	.后面有一个单词，单词后面有小括号，表示访问的是方法。

这个一定要画出内存图，很有研究价值。
*/
public class Last{
	public static void main(String[] args){
		// 创建丈夫对象（丈夫还没有妻子）
		//Husband h = new Husband("1111111", "张三", "1999-10-11", null);
		Husband h = new Husband("1111111", "张三", "1999-10-11");

		// 创建妻子对象（妻子还没有丈夫）
		//Wife w = new Wife("222222", "李四", "1989-11-10", null);
		Wife w = new Wife("222222", "李四", "1989-11-10");

		// 让他俩结婚（产生关系）
		h.wife = w;
		w.husband = h;

		// 输出丈夫对象的妻子名字
		//System.out.println(h.name + "的妻子是" + w.name); //这样写错误的。
		//当没有结婚的时候，出现：java.lang.NullPointerException
		System.out.println(h.name + "的妻子是" + h.wife.name);
		System.out.println(w.name + "的丈夫是" + w.husband.name);

	}
}

// 丈夫类
class Husband{
	// 身份证号
	String idCard;
	// 姓名
	String name;
	// 生日
	String birth;
	// 妻子
	Wife wife; //实例变量

	// 无参数构造方法
	public Husband(){
	
	}

	// 有参数的构造方法
	public Husband(String s1,String s2,String s3){
		idCard = s1;
		name = s2;
		birth = s3;
	}


	// 有参数的构造方法
	public Husband(String s1,String s2,String s3, Wife w){
		idCard = s1;
		name = s2;
		birth = s3;
		wife = w;
	}

}

// 妻子类
class Wife{
	// 身份证号
	String idCard;
	// 姓名
	String name;
	// 生日
	String birth;
	// 丈夫
	Husband husband;

	// 无参数的构造方法
	public Wife(){
	
	}

	// 有参数的构造方法
	public Wife(String s1,String s2,String s3){
		idCard = s1;
		name = s2;
		birth = s3;
	}

	// 有参数构造方法
	public Wife(String s1,String s2,String s3,Husband h){
		idCard = s1;
		name = s2;
		birth = s3;
		husband = h;
	}
}