// 把这个内存图画出来。一定要按照程序的执行顺序一步一步画。
public class T{
	A o1; // 成员变量中的实例变量。必须先创建对象，通过“引用”来访问。

	public static void main(String[] args){
		D d = new D();
		C c = new C();
		B b = new B();
		A a = new A();
		T t = new T();

		//这里不写代码会出现NullPointerException异常。（空指针异常。）
		c.o4 = d;
		b.o3 = c;
		a.o2 = b;
		t.o1 = a;

		// 编写代码通过t来访问d中的i
		//System.out.println(T.a); //错误的。
		System.out.println(t.o1.o2.o3.o4.i);
	}
}
class A{
	B o2;
}
class B{
	C o3;
}
class C{
	D o4;
}
class D{
	int i;
}