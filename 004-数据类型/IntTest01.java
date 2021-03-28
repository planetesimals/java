
/*
	整数型在java语言中共4种类型：
		byte	1个字节  最大值127
		short	2个字节  最大值32767
		int	4个字节  2147483647是int最大值，超了这个范围可以使用long类型。
		long	8个字节

		1个字节 = 8个二进制位
		1byte = 8bit

		对于以上的四个类型来说，最常用的是int。
		开发的时候不用斤斤计较，直接选择使用int就行了。
	
	在java语言中整数型字面量有4种表示形式：
		十进制：最常用的。
		二进制
		八进制
		十六进制
*/
public class IntTest01{
	public static void main(String[] args){
		// 十进制
		int a = 10; 
		System.out.println(a); // 10

		// 八进制
		int b = 010;
		System.out.println(b); // 8

		// 十六进制
		int c = 0x10;
		System.out.println(c); // 16

		int x = 16; //十进制方式
		System.out.println(x);

		// 二进制（JDK8的新特性，低版本不支持。）
		int d = 0b10;
		System.out.println(d); // 2
	}
}