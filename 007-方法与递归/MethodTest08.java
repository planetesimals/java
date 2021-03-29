
// 局部变量：只在方法体中有效，方法结束之后，局部变量的内存就释放了。
// JVM三块主要的内存：栈内存、堆内存、方法区内存。
// 方法区最先有数据：方法区中放代码片段。存放class字节码。
// 堆内存：后面讲。
// 栈内存：方法调用的时候，该方法需要的内存空间在栈中分配。
// 方法不调用是不会在栈中分配空间的。

// 方法只有在调用的时候才会在栈中分配空间，并且调用时就是压栈。
// 方法执行结束之后，该方法所需要的空间就会释放，此时发生弹栈动作。

// 方法调用叫做：压栈。分配空间
// 方法结束叫做：弹栈。释放空间

// 栈中存储什么？方法运行过程中需要的内存，以及栈中会存储方法的局部变量。

public class MethodTest08{
	//主方法，入口
	public static void main(String[] args){
		
		//int a = 100;
		// 这个赋值原理是：将a变量中保存的100这个数字复制一份传给b变量。
		// 所以a和b是两个不同的内存空间，是两个局部变量。
		//int b = a;

		System.out.println("main begin");
		int x = 100;
		m1(x);
		System.out.println("main over");
	}
	public static void m1(int i){ // i是局部变量
		System.out.println("m1 begin");
		m2(i);
		System.out.println("m1 over");
	}
	public static void m2(int i){
		System.out.println("m2 begin");
		m3(i);
		System.out.println("m2 over");
	
	}
	public static void m3(int i){
		System.out.println("m3 begin");
		System.out.println(i);
		System.out.println("m3 over");
	}
}