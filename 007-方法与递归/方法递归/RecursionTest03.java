
// 使用递归，请编写程序，计算1~n的和。
public class RecursionTest03{
	public static void main(String[] args){
		// 1~3的和
		int n = 3;
		int r = sum(n);
		System.out.println(r); // 6
	}

	// 大家努力的去看，去听，自己写不出来没关系，关键是能不能看懂。
	// 单独编写一个计算1~n和的方法
	// 这个代码修改为递归的方式。
	// 3 + 2 + 1
	public static int sum(int n){
		//n最初等于3
		// 3 + 2 (2是怎么的出来的：n - 1)
		//sum(n - 1); 
		if(n == 1){
			return 1;
		}
		// 程序能执行到此处说明n不是1
		return n + sum(n-1);
	}
}