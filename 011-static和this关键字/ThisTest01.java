/*
	this：
		1、this是一个关键字，全部小写。
		2、this是什么，在内存方面是怎样的？
			一个对象一个this。
			this是一个变量，是一个引用。this保存当前对象的内存地址，指向自身。
			所以，严格意义上来说，this代表的就是“当前对象”
			this存储在堆内存当中对象的内部。

		3、this只能使用在实例方法中。谁调用这个实例方法，this就是谁。
		所以this代表的是：当前对象。

		4、“this.”大部分情况下是可以省略的。

		5、为什么this不能使用在静态方法中？？？？？？
			this代表当前对象，静态方法中不存在当前对象。
*/
public class ThisTest01{
	public static void main(String[] args){

		Customer c1 = new Customer("张三");
		c1.shopping();

		Customer c2 = new Customer("李四");
		c2.shopping();

		Customer.doSome();
	}
}

// 顾客类
class Customer{

	// 属性
	// 实例变量（必须采用“引用.”的方式访问）
	String name;   

	//构造方法
	public Customer(){
	
	}
	public Customer(String s){
		name = s;
	}

	// 顾客购物的方法
	// 实例方法
	public void shopping(){
		// 这里的this是谁？this是当前对象。
		// c1调用shopping(),this是c1
		// c2调用shopping(),this是c2
		//System.out.println(this.name + "正在购物!");

		// this. 是可以省略的。
		// this. 省略的话，还是默认访问“当前对象”的name。
		System.out.println(name + "正在购物!");
	}

	// 静态方法
	public static void doSome(){
		// this代表的是当前对象，而静态方法的调用不需要对象。矛盾了。
		// 错误: 无法从静态上下文中引用非静态 变量 this
		//System.out.println(this);
	}
}


class Student{

	// 实例变量，怎么访问？必须先new对象，通过“引用.”来访问。
	String name = "zhangsan";

	// 静态方法
	public static void m1(){
		//System.out.println(name);

		// this代表的是当前对象。
		//System.out.println(this.name);

		// 除非你这样
		Student s = new Student();
		System.out.println(s.name);

	}

	//为什么set和get方法是实例方法？
	public static void setName(String s){
		name = s;
	}
	public String getName(){
		return name;
	}

	// 又回到上午的问题了？什么时候方法定义为实例方法，什么时候定义为静态方法？
	// 如果方法中直接访问了实例变量，该方法必须是实例方法。
}