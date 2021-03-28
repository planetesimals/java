/*
	结论：byte、char、short做混合运算的时候，各自先转换成int再做运算。
*/
public class IntTest06{
	public static void main(String[] args){

		char c1 = 'a';
		byte b = 1;

		// 注意：这里的"+"是负责求和的
		System.out.println(c1 + b); // 98

		// 错误: 不兼容的类型: 从int转换到short可能会有损失
		//short s = c1 + b; // 编译器不知道这个加法最后的结果是多少。只知道是int类型。

		// 这样修改行吗？
		//错误: 不兼容的类型: 从int转换到short可能会有损失
		//short s = (short)c1 + b;

		short s = (short)(c1 + b);

		//short k = 98;

		int a = 1;
		//错误: 不兼容的类型: 从int转换到short可能会有损失
		// short x = 1; 可以
		short x = a; // 不可以，编译器只知道a是int类型，不知道a中存储的是哪个值。
		System.out.println(x);
	}
}