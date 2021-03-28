/*
	字符型：
		char

		1、char占用2个字节。
		2、char的取值范围：[0-65535]
		3、char采用unicode编码方式。
		4、char类型的字面量使用单引号括起来。
		5、char可以存储一个汉字。
*/
public class CharTest01{
	public static void main(String[] args){
		// char可以存储1个汉字吗？
		// 可以的，汉字占用2个字节，java中的char类型占用2个字节，正好。
		char c1 = '中';
		System.out.println(c1);

		char c2 = 'a';
		System.out.println(c2);

		// 0如果加上单引号的话，0就不是数字0了，就是文字0，它是1个字符。
		char c3 = '0';
		System.out.println(c3);

		// 错误: 不兼容的类型: String无法转换为char
		//char c4 = "a";

		// 错误: 未结束的字符文字
		//char c5 = 'ab';

		// 错误: 未结束的字符文字
		//char c6 = '1.08';

	}
}