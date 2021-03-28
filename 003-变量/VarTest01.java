/*
	变量的第一个测试程序：Var是变量

	1、关于程序当中的数据？
		开发软件是为了解决现实世界中的问题。
		而现实世界当中，有很多问题都是使用数据进行描述的。
		所以软件执行过程中最主要就是对数据的处理。

		软件在处理数据之前需要能够表示数据，在java代码中
		怎么去表示数据呢？在java中有这样的一个概念：字面量。

		注意：在java语言中“数据”被称为“字面量”。
		10
		1.23
		true
		false
		'a'
		"abc"
		以上这些都是数据，在程序中都被叫做“字面量”。

		字面量可以分为很多种类：
			整数型字面量：1 2 3 100 -100 -20 ....
			浮点型字面量：1.3 1.2 3.14.....
			布尔型字面量：true、false没有其它值了，表示真和假,true表示真，false表示假

			字符型字面量：'a'、'b'、'中'
			字符串型字面量："abc"、"a"、"b"、"中国"

			其中字符型和字符串型都是描述了现实世界中的文字：
				需要注意的是：
					所有的字符型只能使用单引号括起来。
					所有的字符串型只能使用双引号括起来。
				
				字符型一定是单个字符才能成为“字符型”

				在语法级别上怎么区分字符型和字符串型？
					主要看是双引号还是单引号。
					单引号的一定是字符型。
					双引号的一定是字符串型。

	2、什么是变量？
		
*/
public class VarTest01{
	public static void main(String[] args){
		System.out.println(100);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println(false);
		System.out.println('a');
		System.out.println('中');
		System.out.println("abc");
		System.out.println("国"); // 这不属于字符型，因为使用双引号括起来了，所以它是字符串。

		// 编译报错。ab是一个串，不是字符型，不能用单引号。
		//System.out.println('ab');

		System.out.println('好'); // 属于字符型
		System.out.println("好"); // 属于字符串型
		System.out.println("1"); //属于整数型吗？不是，是字符串。
		System.out.println("true"); // 属于布尔型吗？不是，是字符串。
		System.out.println("3.14"); // 字符串型

		System.out.println(1); // 整数型
		System.out.println(3.14); // 浮点型
		System.out.println(true); // 布尔型
		System.out.println(false); // 布尔型

		//分析一下：如果只有字面量，没有变量机制的话，有什么问题？
		// 10 是一个整数型数据，在内存中占有一定的空间（CPU 内存 硬盘）
		// 10 + 20 = 30
		// 在内存中找一块空间存储10，再找一块空间存储20，CPU负责“+”运算，算完
		// 之后的结果是30，那么这个30也会在内存当中找一块临时的空间存储起来。
		// 思考：以下的三个10在内存当中是一块空间，还是三块不同的空间呢？
		// 以下虽然都是10，但是这3个10占用三块不同的内存空间。
		System.out.println(10);
		System.out.println(10);
		System.out.println(10); // 只有“字面量”机制的话，是远远不够的，因为只有字面量内存是无法重复利用的。

		// 定义/声明一个变量，起名i
		int i = 1000;
		// 以下这5次访问都是访问的同一块内存空间。（这样使用变量之后，内存空间就得到了复用。）
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);

		// 以下程序表示访问的是字符i以及字符串i，以下的这两个i和以上的i变量没有任何关系。
		System.out.println('i');
		System.out.println("i");

	}

}