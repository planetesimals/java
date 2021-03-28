/*
	1、什么是注释，有什么用？
		注释是对java源代码的解释说明。
		注释可以帮程序员更好的理解程序。

	2、注释信息只保存在java源文件当中，java源文件编译生成的字节码class文件，
	这个class文件中是没有这些注释信息的。

	3、在实际的开发中，一般项目组都要求积极的编写注释。这也是一个java软件工程师
	的基本素养。

	4、注释不是写的越多越好，精简，主线清晰，每个注释都应该是点睛之笔。（以后慢慢锻炼）
*/

// 这种注释属于单行注释，只注释两个斜杠后面的

/**
* 类的注释信息
* @version 1.0
* @author bjpowernode-dujubin
* ....
*/
public class HelloWorld{ // 这是一个类，类名叫做HelloWorld
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println("动力节点-口口相传的Java黄埔军校");
	}
}

/*
	在这里可以编写多行注释
	这是一行注释
	这是第二行注释
	这是第三行注释
*/