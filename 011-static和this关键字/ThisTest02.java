
// 分析：i变量在main方法中能不能访问？？？？

public class ThisTest02{

	// 实例变量
	int i = 100; // 这个i变量是不是必须先new对象才能访问。

	// 静态变量
	static int k = 111;

	// 静态方法
	public static void main(String[] args){
		// 错误: 无法从静态上下文中引用非静态 变量 i
		// System.out.println(i);

		// 怎么样访问i
		ThisTest02 tt = new ThisTest02();
		System.out.println(tt.i);

		// 静态变量用“类名.”访问。
		System.out.println(ThisTest02.k);

		// 类名. 能不能省略？
		// 可以
		System.out.println(k);
	}
}