
/*
	编写一个方法，输出大于某个正整数n的最小的质数
		比如：这个正整数n是2
		也就是要输出：大于2的最小的质数，结果就是3

		比如：这个正整数n是9
		也就是要输出：大于9的最小的质数，结果就是11

		大于11的最小的质数是：13
	
	思路：
		首先，系统一定会先给你一个“正整数n”，然后你基于
		这个n往后++，每加1得到的新数m判断一下是否为质数。
*/
public class Homework2{

	public static void main(String[] args){

		/*
		// 假设目前系统给了一个正整数n，n为5
		int n = 5;
		// 请找出大于5的最小的质数
		while(true){
			n++; // n自加1
			// 判断此时的n是否为质数
			boolean flag = isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
		*/
		
		// 对一个单独的方法进行测试
		/*
		boolean flag = isZhiShu(6);
		System.out.println(flag ? "质数" : "非质数"); // true
		*/

		printZuiXiaoZhiShu(5);
		printZuiXiaoZhiShu(10);
		printZuiXiaoZhiShu(12);
		printZuiXiaoZhiShu(100);
	}

	// 这方法就是用来打印最小质数的。
	public static void printZuiXiaoZhiShu(int n){
		while(true){
			n++; // n自加1
			// 判断此时的n是否为质数
			boolean flag = isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
	}

	// 定义一个专门的方法，来判断某个数字是否为质数
	// 这个方法的形参是：被判断的数字num
	// 这个方法的返回值类型是true表示是质数，是false表示非质数。
	public static boolean isZhiShu(int num){
		// 你怎么判断num是否是一个质数
		// 质数只能被1和自身整除
		for(int i = 2; i < num; i++){ 
			if(num % i == 0){
				return false;
			}
		}
		//程序能够执行到此处说明num已经是质数了。
		return true;
	}

}