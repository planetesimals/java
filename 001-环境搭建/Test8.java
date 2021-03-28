
/*
	1、这个内容没有为什么，只能经过测试，然后根据测试结果进行记忆。

	2、第一个结论？
		一个java源文件中可以定义多个class。
	
	3、第二个结论？
		public的类不是必须的。可以没有。

	4、第三个结论？
		在源文件中只要有一个class的定义，那么必然会对应生成一个class文件。
	
	5、第四个结论？
		public的类可以没有，但如果有的话，public修饰的类名必须和源文件名保持一致。
	
	6、第五个结论？
		public的类有也只能有1个。
*/
class A{

}

/*
	Test8.java:20: 错误: 类 B 是公共的, 应在名为 B.java 的文件中声明
	public class B{
			 ^
	1 个错误
*/
/*
public class B{

}
*/

// 如果定义public的类你只能这样写
public class Test8{
}

class C{

}

class D{

}

//错误: 类重复: Test8
/*
public class Test8{
}
*/