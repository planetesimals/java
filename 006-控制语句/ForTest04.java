/*
	使用for循环，实现1~100所有奇数求和
	至少给出两种解决方案。
*/
public class ForTest04{
	public static void main(String[] args){

		//第一种方案：
		// 思路：先找出1~100所有的奇数，然后再考虑求和的事儿。
		// 第一步：先从1取到100，一个数字一个数字取出来。
		// 第二步：既然可以得到每一个数字，那么我们进一步判断这个数字是否为奇数
		// 奇数对2求余数，结果都是1
		int sum = 0; // 初始值给0
		for(int i = 1; i <= 100; i++){
			// int sum = 0; // 不能在这个循环体中声明，这样会导致“计算器归0”
			//for循环中嵌套了if语句。
			if(i % 2 == 1){ // i为奇数的条件
				//System.out.println("i = " + i);
				sum += i; // 累加 (sum = sum + i;)
			}
		}
		// 一定是在for循环全部结束之后，输出的sum就是最终的结果。
		System.out.println("1~100所有奇数求和结果是：" + sum); // 2500

		//第二种方案：这种方案效率高，因为循环次数比较少。
		// 之前的sum归0.重新求和。
		sum = 0;
		for(int i = 1; i < 100; i += 2){
			//这样写可以保证每一次取出的值都是奇数。不需要判断。
			//System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
	}
}