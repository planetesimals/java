/*
1、观察学生对象的共同特征（只观察属性）
	有哪些共同特征：
		学号：采用int类型
		姓名：采用String类型
		年龄：采用int类型
		性别：采用char或者boolean类型
		住址：采用String类型

		注意：属性是成员变量。
		
2、以上是分析总结的结果，可以开始写代码了：
	定义XueSheng类，编写成员变量作为属性。

3、变量有一个特点：
	必须先声明，再赋值，才能访问。
	成员变量可以不手动赋值？？？？？？？？？？

XueSheng既是一个类名，同时又是一个“类型名”，属于引用数据类型。
*/
public class XueSheng{ // 这个程序编译之后，会生成XueSheng.class字节码文件。

	// 属性

	// 学号（成员变量）
	int xueHao;

	// 姓名
	String xingMing;

	// 年龄
	int nianLing;

	// 性别
	boolean xingBie;

	// 住址
	String zhuZhi;

}