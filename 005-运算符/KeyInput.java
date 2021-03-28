/*
1、输出信息到控制台：
	System.out.println(...);
2、在java中怎么接收键盘的输入呢？
	先声明一下，这个代码看不懂很正常，因为这个代码是面向对象章节学习之后才能够理解。
	这个代码以后复制粘贴就行。

	前提：java.util.Scanner s = new java.util.Scanner(System.in); 
	接收一个整数怎么办？
		int num = s.nextInt();
		
	接收一个字符串怎么办？
		String str = s.next();
*/
public class KeyInput{
	public static void main(String[] args){

		// 创建一个键盘扫描器对象
		// s 变量名，可以修改。其它不能改。 
		java.util.Scanner s = new java.util.Scanner(System.in); //这行代码写一次就行了。

		// 接收用户的输入，从键盘上接收一个int类型的数据
		// 解释这行代码，尽量让大家明白：代码执行到这里的时候，会暂停下来
		// 等待用户的输入，用户可以从键盘上输入一个整数，然后回车，回车之后
		// i变量就有值了。并且i变量中保存的这个值是用户输入的数字。
		// i变量就是接收键盘数据的。
		int i = s.nextInt(); // i是变量名，s是上面的变量名
		System.out.println("您输入的数字是：" + i);

		// 代码执行到此处又会停下来，等待用户的输入。
		// 敲完回车，s.nextInt();代码执行结束。
		int j = s.nextInt();
		System.out.println("您输入的数字是：" + j);

		// 如果输入的不是数字，那么会出异常：InputMismatchException
		int m = s.nextInt();
		System.out.println("您输入的数字是：" + m);

		// 我怎么从键盘上接收一个字符串呢？
		// 程序执行到此处会停下来，等待用户的输入，用户可以输入字符串。
		String str = s.next();
		System.out.println("您输入了：" + str);

		// 完整的。
		System.out.print("请输入用户名：");
		String name = s.next();
		System.out.println("欢迎"+name+"回来");
	}
}