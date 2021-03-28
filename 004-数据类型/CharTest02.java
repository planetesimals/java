/*
	关于java中的转义字符
		java语言中“\”负责转义。
			\t 表示制表符tab
*/
public class CharTest02{
	public static void main(String[] args){

		// 普通的't'字符
		char c1 = 't';
		System.out.println(c1);
		
		//char x = 'ab';

		// 根据之前所学，以下代码应该报错。
		// 经过测试以下代码 \t 实际上是1个字符，不属于字符串
		// 两个字符合在一起表示一个字符，其中 \t 表示“制表符tab”
		char c2 = '\t'; //相当于键盘上的tab键

		System.out.println("abcdef");
		System.out.println("abctdef");
		// \的出现会将紧挨着的后面的字符进行转义。\碰到t表示tab键。
		System.out.println("abc\tdef");
		
		/*
			System.out.println(); 换行
			System.out.print(); 不换行
		*/
		System.out.print("HelloWorld");
		System.out.println("123abcdef");

		System.out.print("abc");
		//char c3 = 'n'; // 普通的n字符
		char c3 = '\n'; // 换行符
		//System.out.print(c3);
		System.out.println(c3);
		System.out.println("def"); 

		// 假设现在想在控制台输出一个 ' 字符怎么办？
		// 错误: 空字符文字
		//System.out.println(''');
		// \' 表示一个普通不能再普通的单引号字符。（\'联合起来表示一个普通的 '）
		System.out.println('\'');

		// 假设现在想在控制台输出一个 \ 字符怎么办？
		//错误: 未结束的字符文字
		//System.out.println('\');
		// 在java中两个反斜杠代表了一个“普通的反斜杠字符”
		System.out.println('\\');

		// 双引号括起来的是字符串
		System.out.println("test");
		// 希望输出的结果是："test"
		// 错误: 需要')'
		//System.out.println(""test"");
		System.out.println("“test”"); //内部的双引号我用中文的行吗？可以。

		System.out.println("");
		// 编译报错。
		//System.out.println(""");
		//System.out.println("\"");
		System.out.println("\"test\"");

		// 这个可以输出吗？
		// 这个不需要专门进行转义。
		// 这个 ' 在这里只是一个普通的字符，不具备特殊含义。
		System.out.println("'");

		//以下都有问题
		//System.out.println(''');
		//System.out.println(""");

		// 可以的。
		System.out.println("'这样呢'");

		// 编译报错，因为：4e2d 是一个字符串
		// 错误: 未结束的字符文字
		//char x = '4e2d';

		// 反斜杠u表示后面的是一个字符的unicode编码。
		// unicode编码是十六进制的。
		char x = '\u4e2d';
		System.out.println(x); // '中'
	}
} 
/*
十六进制，满16进1位：
	1 2 3 4 5 6 7 8 9 a b c d e f 10
	11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20...

八进制：
	0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....
*/