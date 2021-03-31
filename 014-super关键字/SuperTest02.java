
/*
	判断程序的输出结果
	1
	3
	6
	5
	4

	在java语言中不管是是new什么对象，最后老祖宗的Object类的无参数构造方法
	一定会执行。（Object类的无参数构造方法是处于“栈顶部”）

	栈顶的特点：
		最后调用，但是最先执行结束。
		后进先出原则。
	
	大家要注意：
		以后写代码的时候，一个类的无参数构造方法还是建议大家手动的写出来。
		如果无参数构造方法丢失的话，可能会影响到“子类对象的构建”。

*/
public class SuperTest02{
	public static void main(String[] args){
		new C();

	}
}

/*
class Object{
	public Object(){	
	}
}
*/

class A extends Object{
	public A(){
		System.out.println("1"); //1
	}
}

class B extends A{
	public B(){
		System.out.println("2"); //2
	}
	public B(String name){
		super();
		System.out.println("3"); // 3
	}
}

class C extends B{
	public C(){ // 这个是最先调用的。但是最后结束。
		this("zhangsan");
		System.out.println("4");//4
	}
	public C(String name){
		this(name, 20);
		System.out.println("5");//5
	}
	public C(String name, int age){
		super(name);
		System.out.println("6");//6
	}
}