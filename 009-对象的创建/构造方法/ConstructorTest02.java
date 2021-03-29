
/*
	1、构造方法对应的英语单词：Constructor【构造器】
	2、构造方法作用：
		创建对象，并且创建对象的过程中给属性赋值（初始化。）
*/
public class ConstructorTest02{
	public static void main(String[] args){

		User u = new User();

		System.out.println(u.id); //111
		System.out.println(u.name); //lisi
		System.out.println(u.age); //30

		User u2 = new User(1111111);
		System.out.println(u2.id); //0
		System.out.println(u2.name); // null
		System.out.println(u2.age); // 0
	}
}