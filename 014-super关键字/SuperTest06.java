
/*
	通过这个测试得出的结论：
		super 不是引用。super也不保存内存地址，super也不指向任何对象。
		super 只是代表当前对象内部的那一块父类型的特征。
*/
public class SuperTest06 {

	// 实例方法
	public void doSome(){
		// SuperTest06@2f92e0f4
		System.out.println(this);
		// 输出“引用”的时候，会自动调用引用的toString()方法。
		//System.out.println(this.toString());

		//编译错误: 需要'.'
		//System.out.println(super);
	}

	// this和super不能使用在static静态方法中。
	/*
	public static void doOther(){
		System.out.println(this);
		System.out.println(super.xxx);
	}
	*/

	// 静态方法，主方法
	public static void main(String[] args){
		SuperTest06 st = new SuperTest06();
		st.doSome();

		// main方法是静态的
		// 错误的。
		/*
		System.out.println(this);
		System.out.println(super.xxxx);
		*/
	}
}