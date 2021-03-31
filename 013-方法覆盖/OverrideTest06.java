
// 经过测试，你记住就行。
// 私有方法不能覆盖。
public class OverrideTest06{

	// 私有方法
	private void doSome(){
		System.out.println("OverrideTest06's private method doSome execute!");
	}

	// 入口
	public static void main(String[] args){
		// 多态
		OverrideTest06 ot = new T();
		ot.doSome(); //OverrideTest06's private method doSome execute!
	}
}

/*
// 在外部类中无法访问私有的。
class MyMain{
	public static void main(String[] args){
		OverrideTest06 ot = new T();
		//错误: doSome() 在 OverrideTest06 中是 private 访问控制
		//ot.doSome();
	}
}
*/

// 子类
class T extends OverrideTest06{
	// 尝试重写父类中的doSome()方法
	// 访问权限不能更低，可以更高。
	public void doSome(){
		System.out.println("T's public doSome method execute!");
	}
}