
// 重要的结论：在同一个域当中（这个域怎么理解，后面讲），变量名不能重名，不能重复声明。
// 变量可以重新赋值，但在同一个域当中，不能重复声明。
public class VarTest04{
	public static void main(String[] args){
		// 声明一个整数型的变量起名nianLing，存储值20
		int nianLing = 20;
		System.out.println(nianLing);

		// 给变量重新赋值
		nianLing = 30;
		System.out.println(nianLing);

		// 这个可以吗？不行
		// 错误信息:错误: 已在方法 main(String[])中定义了变量 nianLing
		/*
		int nianLing = 100;
		System.out.println(nianLing); 
		*/
	}
}