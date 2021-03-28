
/*
	变量的作用域？
		1、什么是作用域？
			变量的有效范围。
		2、关于变量的作用域，大家可以记住一句话：
			出了大括号就不认识了。（死记这句话。）
		3、java中有一个很重要的原则：
			就近原则。（不仅java中是这样，其它编程语言都有这个原则。）
			哪个离我近，就访问哪个。
*/

public class VarTest08{

	// 成员变量
	int i = 10000;

	public static void main(String[] args){
		// 局部变量
		int i = 100; // 这个i的有效范围是main方法。
		System.out.println(i); // 这个i是多少？

		// 同一个域当中，这是不允许的。
		//int i = 90;  

		// 考核一下：以下编写for循环你看不懂，没关系，后面会将。
		for(int n = 0; n < 10; n++){ // 这里声明的n变量只属于for域。for结束后n释放没了。
			// 这里没有编写代码。
		}

		// for循环执行结束之后，在这里访问n变量可以吗？
		//System.out.println(n);  //错误: 找不到符号

		int k; // 属于main域。
		for(k = 0; k < 10; k++){

		}
		// 能否继续访问k呢？
		System.out.println(k);
	}

	// 这个方法怎么定义先不用管，后面会学习。
	public static void x(){
		// 在这个位置上能访问i吗？
		// 错误: 找不到符号
		// System.out.println(i); // i是无法访问的。

		// 可以定义一个变量起名i吗？
		// 这个i的有效范围是x方法。
		// 局部变量
		int i = 200; // 所以这个i和main方法中的i不在同一个域当中。不冲突。
	}
}