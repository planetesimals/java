/*
	1、整数能否直接赋值给char
	2、char x = 97;
		这个java语句是允许的，并且输出的结果是'a'
		经过这个测试得出两个结论：
			第一个结论：当一个整数赋值给char类型变量的时候，会自动转换成char字符型，
			最终的结果是一个字符。

			第二个结论：当一个整数没有超出byte short char的取值范围的时候，
			这个整数可以直接赋值给byte short char类型的变量。
*/
public class CharTest03{
	public static void main(String[] args){
	
		char c1 = 'a';
		System.out.println(c1);

		// 这里会做类型转换吗？
		// 97是int类型（这是java中规定，默认当做int处理）
		// c2是char类型
		//char c2 = (char)97; // 不需要这样做。
		char c2 = 97;
		System.out.println(c2); // 'a'

		// char类型取值范围：[0~65535]
		char c3 = 65535; // 实际上最终是一个“看不懂”的字符。
		System.out.println(c3);

		//错误: 不兼容的类型: 从int转换到char可能会有损失
		//char c4 = 65536;

		// 怎么解决以上问题？
		char c4 = (char)65536;

		byte x = 1;
		short s = 1;
		char c = 1;

	}
}