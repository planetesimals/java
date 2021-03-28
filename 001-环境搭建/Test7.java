public class Test7{
	
	public static void main(String[] args){

		// 这个不加双引号行吗？
		// 可以，因为它是数字。
		System.out.println(100);

		// 是数字，加双引号行吗？
		System.out.println("100");

		// 以上性质一样吗？
		// 不一样：一个是字符串，一个是数字。
		// 但最终输出到控制台上一个样子，没啥区别。

		// 这里扩展一下：对于数字来说能进行加减乘除吗？
		// + 能用吗？
		// - 能用吗？
		// / 能用吗？
		// * 能用吗？
		// 可以
		System.out.println(100 + 200); // 300
		System.out.println(200 - 100); // 100
		System.out.println(200 * 100); // 20000
		System.out.println(200 / 100); // 2

	}
}