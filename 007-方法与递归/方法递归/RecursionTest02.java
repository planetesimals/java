
// 先不使用递归，请编写程序，计算1~n的和。
public class RecursionTest02{
	public static void main(String[] args){
		// 1~10的和
		int retValue1 = sum(10);
		System.out.println(retValue1);

		// 1~3的和
		int retValue2 = sum(3);
		System.out.println(retValue2); // 6 (1 + 2 + 3)
	}

	// 单独编写一个计算1~n和的方法
	public static int sum(int n){
		int result = 0;
		for(int i = 1; i <= n; i++){
			result += i;
		}
		return result;
	}
}