
public class VarTest03{
	public static void main(String[] args){
		// 在这里可以访问k变量吗？
		// 注意：方法体当中的代码遵循自上而下的顺序依次逐行执行。
		// 所以以下程序编译报错。
		System.out.println(k); //错误: 找不到符号

		// 只有执行了这一行代码，k变量在内存中才会开辟空间。
		int k = 10;
	}
}