/*
	关于java语言中的package和import机制：

		1、为什么要使用package？
			package是java中包机制。包机制的作用是为了方便程序的管理。
			不同功能的类分别存放在不同的包下。（按照功能划分的，不同的
			软件包具有不同的功能。）
		
		2、package怎么用？
			package是一个关键字，后面加包名。例如：
			package com.bjpowernode.javase.chapter17;
			注意：package语句只允许出现在java源代码的第一行。
		
		3、包名有没有命名规范？有
			一般都采用公司域名倒序的方式（因为公司域名具有全球唯一性。）
			包名命名规范：
				公司域名倒序 + 项目名 + 模块名 + 功能名
		
		4、对于带有package的java程序怎么编译？怎么运行？

			采用之前的编译和运行不行了。
			类名不再是：HelloWorld了。
			类名是：com.bjpowernode.javase.chapter17.HelloWorld

			编译：
				javac -d . HelloWorld.java
				解释一下：
					javac 负责编译的命令
					-d		带包编译
					.		代表编译之后生成的东西放到当前目录下（点代表当前目录）
					HelloWorld.java  被编译的java文件名。
				
			运行：
				java com.bjpowernode.javase.chapter17.HelloWorld
		
		5、关于import的使用。

			import什么时候使用？
				A类中使用B类。
				A和B类都在同一个包下。不需要import。
				A和B类不在同一个包下。需要使用import。
				java.lang.*;这个包下的类不需要使用import导入。

			import怎么用？
				import语句只能出现在package语句之下，class声明语句之上。
				import语句还可以采用星号的方式。
*/
package com.bjpowernode.javase.chapter17;

public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
