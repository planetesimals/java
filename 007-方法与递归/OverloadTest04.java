public class OverloadTest04{
	public static void main(String[] args){
		// 大家是否承认：println是一个方法名。
		// println我承认是方法名了，但是这个方法谁写的？SUN公司的java团队写的。
		// 你直接用就行。
		// println()方法肯定是重载了。（不信，你可以翻阅一下SUN公司写的源代码看看。）
		// 对于println()方法来说，我们只需要记忆这一个方法名就行。
		// 参数类型可以随便传。这说明println()方法重载了。
		System.out.println(10);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println('a');
		System.out.println("abc");

		System.out.println(100L);
		System.out.println(3.0F);

		// 调用m方法
		m(100);
	}

	public static void m(int i){
		
	}

}