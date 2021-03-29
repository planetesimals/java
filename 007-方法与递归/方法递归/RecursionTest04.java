// 使用递归的方式计算N的阶乘
// 5的阶乘：5 * 4 * 3 * 2 * 1

// 用递归的方式实现一个。
// 使用for循环的方式实现一个。
public class RecursionTest04{

	public static void main(String[] args){
		int n = 5;
		int jieGuo = jieCheng(n);
		System.out.println(jieGuo); // 120

		System.out.println(jieCheng2(5));
	}

	public static int jieCheng2(int n){
		int result = 1;
		for(int i = 2; i <= n; i++){
			result *= i;
		}
		return result;
	}

	public static int jieCheng(int n){
		// 5 * 4 * 3 * 2 * 1
		if(n == 1){
			return 1;
		}
		/*
		int result = n * jieCheng(n - 1);
		return result;
		*/

		return n * jieCheng(n - 1);
	}
}