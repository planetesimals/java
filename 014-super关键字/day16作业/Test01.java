/*
猜数字游戏
一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
	如果大了则提示大了
	小了则提示小了
	等于则提示猜测成功
*/

public class Test01{
	public static void main(String[] args){
		//创建A对象
		A a = new A(100);
		//创建B对象
		B b = new B(a);
		//开始猜测
		java.util.Scanner s = new java.util.Scanner(System.in);
		while(true){
			System.out.print("请输入要猜测的数字：");
			int caiCeNum = s.nextInt();
			b.cai(caiCeNum);
		}
	}
}

class A{

	private int v;

	public A(){
	
	}
	public A(int v){
		this.v = v;
	}

	public void setV(int v){
		this.v = v;
	}

	public int getV(){
		return v;
	}
}

class B{

	// 通过B猜测A
	// 在B对象中有一个A对象的引用。
	private A a; // 通常初学者，会卡在这里。不知道应该是这样写。
					 // 不知道将A设置为B的一个属性。

	public B(){}

	public B(A a){
		this.a = a;
	}

	public void setA(A a){
		this.a = a;
	}

	public A getA(){
		return a;
	}

	// 猜测的方法
	public void cai(int caiCeNum){
		// 实际数字
		//int shiJiZhi = this.getA().getV();
		int shiJiZhi = a.getV();
		if(caiCeNum == shiJiZhi){
			System.out.println("猜对了");
			// 终止程序的执行
			// 退出JVM
			System.exit(0); // 以前没有写过。退出JVM。
		}else if(shiJiZhi > caiCeNum){
			System.out.println("猜小了");
		}else{
			System.out.println("猜大了");
		}
	}
}