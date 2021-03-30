
/*
	程序再怎么变化，万变不离其宗，有一个固定的规律：
		所有的实例相关的都是先创建对象，通过“引用.”来访问。
		所有的静态相关的都是直接采用“类名.”来访问。
	
	你有发现一些问题吗？
		总有一些是需要记忆的，在这些记忆的基础之上进行分析。
	
	大结论：
		只要负责调用的方法a和被调用的方法b在同一个类当中：
			this. 可以省略
			类名. 可以省略
*/
public class Review02{

	int i = 100;

	static int j = 1000;

	public void m1(){

		// 访问其他类的静态方法
		T.t1();

		// 访问其他类的实例方法
		T t = new T();
		t.t2();
	}

	public void m2(){}

	// 实例方法
	public void x(){ // 这个方法是实例方法，执行这个方法的过程中，当前对象是存在的。
		m1();
		m2();

		m3();
		m4();

		System.out.println(i); // System.out.println(this.i);
		System.out.println(j); // System.out.println(Review02.i);
	}

	public static void m3(){}

	public static void m4(){}

	// 问？你怎么分析这个程序？
	/*
		第一步：
			main方法是静态的，JVM调用main方法的时候直接采用的是“类名.”的方式。
			所以main方法中没有this。

		第二步：
			m1() 和 m2() 方法是实例方法，按照java语法规则来说，实例方法必须先
			new对象，通过“引用.”的方式访问。
	*/
	public static void main(String[] args){
		// 编译报错。
		//m1();
		//m2();

		m3(); // 编译器会自动识别m3()静态方法，结果是：Review02.m3();
		m4(); // Review02.m4();

		//System.out.println(i); // 报错
		System.out.println(j); // 可以

		// 想访问m1() m2()还有i，你在static方法中只能自己new
		Review02 r = new Review02();
		System.out.println(r.i);
		r.m1();
		r.m2();

		// 局部变量，局部变量访问的时候是不需要“xxx.”的
		int k = 10000;
		System.out.println(k);
	}
}


class T{
	// 静态方法
	public static void t1(){
	
	}

	//实例方法
	public void t2(){
	
	}
}
