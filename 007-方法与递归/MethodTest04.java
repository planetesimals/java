
/*
	在方法调用的时候，什么时候“类名.”是可以省略的。什么时候不能省略？
		a()方法调用b()方法的时候，a和b方法都在同一个类中，“类名.”可以
		省略。如果不在同一个类中“类名.”不能省略。
*/

// 类1
public class MethodTest04{

	public static void daYin3(){
		System.out.println("动力节点-口口相传的Java黄埔军校！");
	}
	
	// 入口
	public static void main(String[] args){
		// 调用println()方法。
		MethodTest04.daYin();
		MethodTest04.daYin2();
		MethodTest04.daYin3();

		// “类名. ”可以省略吗？
		daYin();
		daYin2();
		daYin3();

		// 第一次跨类调用。
		// 像这种情况下：“类名.”就不能省略了。
		MyClass.daYin();
		//daYin();
	}

	public static void daYin(){
		System.out.println("hello world!");
	}

	public static void daYin2(){
		System.out.println("hello world2!!!");
	}
}

// 类2
class MyClass{

	public static void daYin(){
		System.out.println("打印1");
	}

	public static void daYin2(){
		System.out.println("打印2");
	}

	public static void daYin3(){
		System.out.println("打印3");
	}
}