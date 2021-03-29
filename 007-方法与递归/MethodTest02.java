/*
	这个程序是一个体验程序，你看不懂，你只需要去体验就行了。
	体验一下方法的好处。

	注意：
		程序开始执行的时候是先执行main方法。
		因为main方法是一个入口。

		在java语言中所有的方法体中的代码都必须遵循自上而下的顺序依次逐行执行。
		这个必须记住。

		main方法不需要程序员手动调用，是由JVM调用的。
		但是除了main方法之外其他的方法，都需要程序员
		手动调用，方法只有调用的时候才会执行，方法不调用
		是不会执行的。
*/
public class MethodTest02{

	// 方法定义在类体当中。
	// 方法定义的先后顺序没有关系。都可以。
	/*
	public static void sumInt(int x, int y){ // 自上而下的顺序依次逐行执行。
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z);
	}
	*/


	// 主方法。入口。
	public static void main(String[] args){ // 自上而下依次逐行执行。
		// 需求1：请编写程序，计算100和200的求和。
		sumInt(100, 200);
		// 需求2：请编写程序，计算666和888的求和。
		sumInt(666, 888);
		// 需求3：请编写程序，计算111和222的和
		sumInt(111, 222);
	}

	// 专门在这个类体当中定义一个方法，这个方法专门来完成求和。
	// x y z在以下的sumInt方法中都属于局部变量
	// 局部变量有一个特点：方法结束之后，局部变量占用的内存会自动释放。
	public static void sumInt(int x, int y){ // 自上而下的顺序依次逐行执行。
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z);
	}

	public static void sum(){
		//System.out.println(x);
		//System.out.println(y); 
		//错误: 找不到符号
		//System.out.println(z);
	}

}

// 这里并没有讲解方法的定义，以及方法的调用。