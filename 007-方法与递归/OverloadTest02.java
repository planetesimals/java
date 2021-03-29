
/*
使用方法重载机制。解决之前的两个缺点。
优点1：代码整齐美观。
优点2：“功能相似”的，可以让“方法名相同”，更易于以后的代码编写。

在java语言中，是怎么进行方法区分的呢？
	首先java编译器会通过方法名进行区分。
	但是在java语言中允许方法名相同的情况出现。
	如果方法名相同的情况下，编译器会通过方法的参数类型进行方法的区分。
*/
public class OverloadTest02{
	public static void main(String[] args){
		// 对于程序员来说，只需要记忆一个方法名即可。
		System.out.println(sum(10, 20));
		System.out.println(sum(10L, 20L));
		System.out.println(sum(10.0, 20.0));
	}
	// 定义一个计算int类型数据的求和方法
	public static int sum(int a, int b){
		System.out.println("int求和");
		return a + b;
	}

	// 定义一个计算long类型数据的求和方法
	public static long sum(long a, long b){
		System.out.println("long求和");
		return a + b;
	}

	// 定义一个计算double类型数据的求和方法
	public static double sum(double a, double b){
		System.out.println("double求和");
		return a + b;
	}
}