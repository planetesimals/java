//判断以下程序的执行顺序
public class CodeOrder{
	
	// 静态代码块
	static{
		System.out.println("A");
	}

	// 入口
	// A X Y C B Z
	public static void main(String[] args){
		System.out.println("Y");
		new CodeOrder();
		System.out.println("Z");
	}

	// 构造方法
	public CodeOrder(){
		System.out.println("B");
	}

	// 实例语句块
	{
		System.out.println("C");
	}

	// 静态代码块
	static {
		System.out.println("X");
	}

}