/*
学生类
	学号：int
	姓名：String
	年龄：int
	性别：boolean
	住址：String

变量必须先声明，再赋值才能访问。

注意：对于成员变量来说，没有手动赋值时，系统默认赋值。
赋的值都是默认值，那么默认值是什么？

类型				默认值
---------------------
byte				0
short				0
int				0
long				0L
float				0.0F
double			0.0
boolean			false
char				\u0000
引用数据类型	null

null是一个java关键字，全部小写，表示空。是引用类型的默认值。

分析：对于成员变量来说，是不是应该一个对象有一份。
	李四有李四的学号
	张三有张三的学号
	李四和张三的学号不一样。所以应该有两块不同的内存空间。

*/
public class Student{

	// 属性（描述状态），在java程序中以“成员变量”的形式存在。

	// 学号
	// 一个对象一份。
	int no; // 这种成员变量又被称为“实例变量”。

	// 姓名
	String name;

	// 年龄
	int age;

	// 性别
	boolean sex;

	// 住址
	String addr;

}
