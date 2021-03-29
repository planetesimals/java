// 目前我们正在学习的一个内容是：方法重载机制（overload）

public class S{
	// 以下所有的p()方法构成了方法的重载。
	// 换行的方法
	public static void p(){
		System.out.println();
	}
	// 输出byte
	public static void p(byte b){
		System.out.println(b);
	}
	// 输出short
	public static void p(short s){
		System.out.println(s);
	}
	// 输出int
	public static void p(int i){
		System.out.println(i);
	}
	// 输出long
	public static void p(long l){
		System.out.println(l);
	}
	// 输出float
	public static void p(float f){
		System.out.println(f);
	}
	// 输出double
	public static void p(double d){
		System.out.println(d);
	}
	// 输出boolean
	public static void p(boolean b){
		System.out.println(b);
	}
	// 输出char
	public static void p(char c){
		System.out.println(c);
	}
	// 输出String
	public static void p(String s){
		System.out.println(s);
	}
}